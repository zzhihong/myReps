package com.zh.interfaceManager.service.dpdd.impl;

import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.apache.log4j.Logger;

import com.chunyv.ws.handler.MyHandlerResolver;
import com.zh.interfaceManager.client.common.Header;
import com.zh.interfaceManager.client.dpdd.ErrorType;
import com.zh.interfaceManager.client.dpdd.ExceptionEntity;
import com.zh.interfaceManager.client.dpdd.IctInsuranceRRT;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserBO2;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRQ2;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRS2;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRS2Pojo;
import com.zh.interfaceManager.client.dpdd.InsurancePojo;
import com.zh.interfaceManager.client.dpdd.InsuranceRRT;
import com.zh.interfaceManager.client.dpdd.InsuranceRRTPojo;
import com.zh.interfaceManager.client.dpdd.ListIctOrderInfoByUserBO2Pojo;
import com.zh.interfaceManager.client.dpdd.ListInsuranceRRTPojo;
import com.zh.interfaceManager.client.dpdd.ServiceHeader;
import com.zh.interfaceManager.client.dpdd.TRSForCustomerSupportCenterServices2Delegate;
import com.zh.interfaceManager.client.dpdd.TRSForCustomerSupportCenterServices2Service;
import com.zh.interfaceManager.service.dpdd.IDPDD;
import com.zh.monitor.SecurityPlatform;
import com.zh.monitor.State;
import com.zh.utils.string.StringTools;

/**
 *@author: zzh
 *@createtime: 2016-3-10下午4:37:44
 *@version: V1.0
 *@Description:调用了订票订单接口，保险两个接口
 */
public class DPDD implements IDPDD {
	private static MyHandlerResolver myHandlerResolver=SecurityPlatform.getMyHandlerResolver();
	private static volatile DPDD dpdd;
	private volatile TRSForCustomerSupportCenterServices2Delegate port;
	private static int time=1000*10;
	private static final Logger logger=Logger.getLogger(DPDD.class);
	private DPDD(){
		init();
	}
	
	private void init(){
		TRSForCustomerSupportCenterServices2Service service = new TRSForCustomerSupportCenterServices2Service();
		service.setHandlerResolver(myHandlerResolver);
		TRSForCustomerSupportCenterServices2Delegate delegate = service.getTRSForCustomerSupportCenterServices2DelegatePort();
		port=delegate;
	}
	
	public static DPDD getInstance(){
		if(dpdd==null)
			return dpdd = new DPDD();
		else 
			return dpdd;
	}
	/*
	 * 控制10s超时时间
	 * */
	private void addTimeLimit(){
		Map<String, Object> ctxt = ((BindingProvider) port).getRequestContext();  
		ctxt.put("com.sun.xml.internal.ws.connect.timeout", time);  
		ctxt.put("com.sun.xml.internal.ws.request.timeout", time);
	}
	
	/*
	 * 获取订票订单数据
	 * */
	@Override
	public ListIctOrderInfoByUserBO2Pojo getWWWZhcxFromWebService(
			IctOrderInfoByUserRQ2 ictOrderInfoByUserRQ) {
		ListIctOrderInfoByUserBO2Pojo listIctOrderInfoByUserBO2Pojo = new ListIctOrderInfoByUserBO2Pojo();
		Header header=new Header();
		String state = State.dpddStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			listIctOrderInfoByUserBO2Pojo.setHeader(header);
			return listIctOrderInfoByUserBO2Pojo;
		}
		addTimeLimit();
		IctOrderInfoByUserRS2 iCTOrderInfoByUserRS =null;
		try{
			iCTOrderInfoByUserRS = port.ictOrderInfoByUser(ictOrderInfoByUserRQ);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				header.setStatus(false);
				header.setMsg("调用订单接口ictOrderInfoByUser:"+time/1000+"s内无返回，请再次查询.....");
				listIctOrderInfoByUserBO2Pojo.setHeader(header);
				logger.error("调用订单接口ictOrderInfoByUser:"+time/1000+"s内无返回，请再次查询....."+"入参为"+ictOrderInfoByUserRQ);
			}else{
				header.setStatus(false);
				header.setMsg("调用订单接口ictOrderInfoByUser异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
				listIctOrderInfoByUserBO2Pojo.setHeader(header);
				logger.error("调用订单接口ictOrderInfoByUser异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
			}
			return listIctOrderInfoByUserBO2Pojo;
		}
		if (iCTOrderInfoByUserRS != null) {
			ServiceHeader serviceHeader = iCTOrderInfoByUserRS.getHeader();
			if (serviceHeader != null) {
				String isSuccess = StringTools.objectToString(serviceHeader
						.getSuccess());
				if (isSuccess.equalsIgnoreCase("Y") == true) {
					List<IctOrderInfoByUserBO2> list = iCTOrderInfoByUserRS.getBody();
					header.setStatus(true);
					listIctOrderInfoByUserBO2Pojo.setListIctOrderInfoByUserBO2(list);
					header.setMsg("结果调用成功返回结果");
				}else {
					ErrorType errorType = serviceHeader.getError();
					String tip = "综合查询平台 互联网接口 ICTOrderInfoByUserRS 对象中的 serviceHeader 的 getSuccess() 不是Y 而是"
							+ isSuccess + " 联系铁科 ！";

					tip = tip + "亲：温馨提示，铁科返回的错误信息码为："
							+ errorType.getErrorCode() + "  铁科返回的错误信息为："
							+ errorType.getErrorMessage() + " 铁科返回的错误原因为："
							+ errorType.getReason();
					header.setStatus(false);
					header.setMsg(tip);
				}
			} else {
				header.setStatus(false);
				header.setMsg("铁科综合查询平台 互联网接口 ICTOrderInfoByUserRS 对象中的 serviceHeader为空  联系铁科 ！");
			}
		} else {
			header.setStatus(false);
			header.setMsg("调用客票接口返回结果为"+iCTOrderInfoByUserRS);
		}
		listIctOrderInfoByUserBO2Pojo.setHeader(header);
		return listIctOrderInfoByUserBO2Pojo;
	}
	
	
	/*
	 * 获取List<InsuranceRRT>信息
	 * */
	@Override
	public ListInsuranceRRTPojo getInsuranceWebService(InsurancePojo insurancePojo) {
		ListInsuranceRRTPojo listInsuranceRRTPojo=new ListInsuranceRRTPojo();
		Header header =new Header();
		String state = State.dpddStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			listInsuranceRRTPojo.setHeader(header);
			return listInsuranceRRTPojo;
		}
		addTimeLimit();
		IctInsuranceRRT insuranceRRt =null;
		try{
			insuranceRRt=port.ictQueryAccidentInsurance(insurancePojo.getCommonHeader(), insurancePojo.getSaleStartDate(), insurancePojo.getSaleEndDate(), insurancePojo.getInsureIdType(), insurancePojo.getInsureIdNo(), insurancePojo.getInsuranceNo(), insurancePojo.getSequenceNo(), insurancePojo.getLoginName());
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				header.setStatus(false);
				header.setMsg("调用保险接口ictQueryAccidentInsurance:"+time/1000+"s内无返回，请再次查询.....");
				listInsuranceRRTPojo.setHeader(header);
				logger.error("调用保险接口ictQueryAccidentInsurance:"+time/1000+"s内无返回，请再次查询....."+"入参为"+insurancePojo);
			}else{
				header.setStatus(false);
				header.setMsg("调用保险接口ictQueryAccidentInsurance异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
				listInsuranceRRTPojo.setHeader(header);
				logger.error("调用保险接口ictQueryAccidentInsurance异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
			}
			return listInsuranceRRTPojo;
		}
		
		if(insuranceRRt==null){
			header.setStatus(false);
			header.setMsg("投保信息查询调用接口返回IctInsuranceRRT为："+insuranceRRt);
		}else{
			 ExceptionEntity exceptionEntity = insuranceRRt.getHeader();
			 if(exceptionEntity==null){
				 header.setStatus(false);
				 header.setMsg("投保信息查询调用接口返回ExceptionEntity为："+exceptionEntity);
			 }else{
				 String isSuccess = StringTools.objectToString( exceptionEntity.getStatus());
				 if(isSuccess.equalsIgnoreCase("Y") == true){
					  List<InsuranceRRT> list = insuranceRRt.getInsuranceRRTList();
					  if(list==null){
						  header.setStatus(false);
						  header.setMsg("乘意险查询调用铁科接口返回数据为空！");
					  }else{
						  header.setStatus(true);
						  listInsuranceRRTPojo.setListInsuranceRRT(list);
					  }
				  }else{
					  header.setStatus(false);
					  header.setMsg("投保信息查询条用接口返回 isSuccess为："+isSuccess);
				  }
			 }
		}
		listInsuranceRRTPojo.setHeader(header);
		return listInsuranceRRTPojo;
	}
	
	
	/*
	 * 获取InsuranceRRT
	 * */
	@Override
	public InsuranceRRTPojo getIctInsuranceRRT(InsurancePojo insurancePojo) {
		InsuranceRRTPojo insuranceRRTPojo=new InsuranceRRTPojo();
		Header header=new Header();
		String state = State.dpddStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			insuranceRRTPojo.setHeader(header);
			return insuranceRRTPojo;
		}
		addTimeLimit();
		IctInsuranceRRT insuranceRRt =null;
		try{
			insuranceRRt= port.ictQueryAccidentInsurance(insurancePojo.getCommonHeader(),insurancePojo.getSaleStartDate(),insurancePojo.getSaleEndDate(),insurancePojo.getInsureIdType(),insurancePojo.getInsureIdNo(),insurancePojo.getInsuranceNo(),insurancePojo.getSequenceNo(),insurancePojo.getLoginName());
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				header.setStatus(false);
				header.setMsg("调用保险接口ictQueryAccidentInsurance:"+time/1000+"s内无返回，请再次查询.....");
				insuranceRRTPojo.setHeader(header);
				logger.error("调用保险接口ictQueryAccidentInsurance:"+time/1000+"s内无返回，请再次查询....."+"入参为"+insurancePojo);
			}else{
				header.setStatus(false);
				header.setMsg("调用保险接口ictQueryAccidentInsurance异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
				insuranceRRTPojo.setHeader(header);
				logger.error("调用保险接口ictQueryAccidentInsurance异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
			}
			return insuranceRRTPojo;
		}
		if (insuranceRRt != null) {
			init();
			header.setStatus(true);
			header.setMsg("结果调用成功返回结果");
			insuranceRRTPojo.setIctInsuranceRRT(insuranceRRt);
		} else {
			header.setStatus(false);
			header.setMsg("iCTOrderInfoByUserRS 对象为空，联系铁科！");
		}
		insuranceRRTPojo.setHeader(header);
		return insuranceRRTPojo;
	}
	
	//获取交易信息
	@Override
	public IctOrderInfoByUserRS2Pojo getDealInfoWebService(IctOrderInfoByUserRQ2 ictOrderInfoByUserRQ) {
		IctOrderInfoByUserRS2Pojo ictOrderInfoByUserRS2Pojo = new IctOrderInfoByUserRS2Pojo();
		Header header=new Header();
		String state = State.dpddStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			ictOrderInfoByUserRS2Pojo.setHeader(header);
			return ictOrderInfoByUserRS2Pojo;
		}
		addTimeLimit();
		IctOrderInfoByUserRS2 iCTOrderInfoByUserRS =null;
		try{
			iCTOrderInfoByUserRS =port.ictOrderInfoByUser(ictOrderInfoByUserRQ);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				header.setStatus(false);
				header.setMsg("调用订单接口ictOrderInfoByUser:"+time/1000+"s内无返回，请再次查询.....");
				ictOrderInfoByUserRS2Pojo.setHeader(header);
				logger.error("调用订单接口ictOrderInfoByUser:"+time/1000+"s内无返回，请再次查询....."+"入参为"+ictOrderInfoByUserRQ);
			}else{
				header.setStatus(false);
				header.setMsg("调用订单接口ictOrderInfoByUser异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
				ictOrderInfoByUserRS2Pojo.setHeader(header);
				logger.error("调用订单接口ictOrderInfoByUser异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
			}
			return ictOrderInfoByUserRS2Pojo;
		}
		if(iCTOrderInfoByUserRS==null){
			header.setStatus(false);
			header.setMsg("调用客票接口返回IctOrderInfoByUserRS2为："+iCTOrderInfoByUserRS);
		}else{
			header.setStatus(true);
			header.setMsg("交易信息家口调用成功");
			ictOrderInfoByUserRS2Pojo.setIctOrderInfoByUserRS2(iCTOrderInfoByUserRS);
		}
		ictOrderInfoByUserRS2Pojo.setHeader(header);
		return ictOrderInfoByUserRS2Pojo;
	}

}

