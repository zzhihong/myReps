package com.zh.monitor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.chunyv.ws.handler.MyHandlerResolver;
import com.zh.interfaceManager.client.dpdd.IctCheckTicketPlatForm;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRQ2;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRS2;
import com.zh.interfaceManager.client.dpdd.TRSForCustomerSupportCenterServices2Delegate;
import com.zh.interfaceManager.client.dpdd.TRSForCustomerSupportCenterServices2Service;
import com.zh.interfaceManager.client.postvm.ICTPOSTVMQueryServiceEndPoint;
import com.zh.interfaceManager.client.postvm.IctQueryPOSTVMTransactionInfoByTicketInfoRes;
import com.zh.interfaceManager.client.postvm.QueryPOSTVM_Service;
import com.zh.interfaceManager.client.pym.DictService;
import com.zh.interfaceManager.client.pym.DictService_Service;
import com.zh.interfaceManager.client.pym.RsInfo;
import com.zh.interfaceManager.client.realname.CommonHeader;
import com.zh.interfaceManager.client.realname.ManageUserInfoWebServiceWS;
import com.zh.interfaceManager.client.realname.ManageUserInfoWebServiceWSDelegate;
import com.zh.interfaceManager.client.realname.RegisterUser;
import com.zh.interfaceManager.client.realname.ResponseEntityRegisterUser;

/**
 * @author: baijiangtao
 * @createtime: 2016年2月29日下午2:20:19
 * @version: V1.0
 * @Description: 单例对象 检测接口，所有webservice接口的检测
 */
public class InterfaceMonitor {
	
	private static Logger logger = Logger.getLogger(InterfaceMonitor.class);

	private static InterfaceMonitor monitor;

	private static MyHandlerResolver myHandlerResolver;
	
	private InterfaceMonitor() {
		myHandlerResolver=SecurityPlatform.getMyHandlerResolver();
	}

	public MyHandlerResolver getMyHandlerResolver() {
		return myHandlerResolver;
	}

	public static InterfaceMonitor getInstance() {
		if (monitor == null)
			return monitor = new InterfaceMonitor();
		else
			return monitor;
	}

	/**
	 * 检测实名制认证接口，查询一个实名制认证接口，看返回是否正常
	 */
	public boolean realnameMonitor() {
		CommonHeader commonHeader = new CommonHeader();
		commonHeader.setBureauCode("P");
		commonHeader.setOperatorNo("10000");
		commonHeader.setSrcIP("10.1.126.155");
		ManageUserInfoWebServiceWS service = new ManageUserInfoWebServiceWS();
		service.setHandlerResolver(myHandlerResolver);
		ManageUserInfoWebServiceWSDelegate port = service
				.getManageUserInfoWebServiceWSDelegatePort();
		RegisterUser registerUser =new RegisterUser();
		registerUser.setIdNo("130526199210234210");
		registerUser.setIdType("1");
		registerUser.setPhone("");
		String tranData="FVFNf0Ucuu2dpXIhv+7asfRJyx1O/eQUGmgORiKnnM/fwFl0PaozwmoMFj9YbjiV2Fb1++pu2ufu"
				+ "XsBh5naStunroNZ49IQl0ytvyOighjM68+eDPEbh4tyjz2RVtK0IXtoqsHgWB7HhBEQuggPnvUSWkPqMewDY"
				+ "p1EXSsqpiCLZd5uk/3T8crZK36gBT+KQXvi0tuMeaRiHprIm7sgrMwLz2uxSWyEdKehDoTE5HQwtG9DPBGvh4jO"
				+ "ZyLC+36dUXkBA58kpnyI0rzUpiSdUz/rS5etzYZTqeyYpTxTJyHWrRCdVVeDJOXWCL0A9pGxUbNtk5/qqY9JH/PGMs7xzqg==";
		try{
			ResponseEntityRegisterUser user = port.ictQueryUserInfo(commonHeader,
					registerUser, tranData);
			if(user!=null){
				logger.info(getStringDate()+"实名制接口正常");
				System.out.println(getStringDate()+"实名制接口正常");
				return true;
			}
			return false;
		}catch(Exception e){
			if(e instanceof com.sun.xml.internal.ws.client.ClientTransportException){
				System.out.println(getStringDate()+"获取到ClientTransportException");
				com.sun.xml.internal.ws.client.ClientTransportException ex=(com.sun.xml.internal.ws.client.ClientTransportException)e;
				System.out.println(ex.getMessage());
				e.printStackTrace();
			}else{
				System.out.println(getStringDate()+"铁科实名制接口异常");
				e.printStackTrace();
			}
			logger.error(getStringDate()+"铁科实名制接口异常"+e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 综合查询接口 互联网售票接口 出现问题最多 使用频率最高的接口 问题大概有几种情况 
	 * 1.接口服务端出现问题 全部查询不出来 10s无返回那种
	 * 2.偶尔出现查询不出来 安全平台堵塞 一些消息的丢失 
	 * 3.某些输入条件就是查询不出来 如特别订单或者特别账号 铁科后台处理有问题那种
	 * 单次测试是通的 怎么测试出来成功率？？？？？？？
	 * 
	 * @return 接口是否正常
	 */
	public boolean zhcxMonitor() {
		TRSForCustomerSupportCenterServices2Service trsFCSCenter = new TRSForCustomerSupportCenterServices2Service();
		trsFCSCenter.setHandlerResolver(myHandlerResolver);// 安全平台配置
		TRSForCustomerSupportCenterServices2Delegate port = trsFCSCenter
				.getTRSForCustomerSupportCenterServices2DelegatePort();

		// 输入条件
		IctOrderInfoByUserRQ2 ictOrderInfoByUserRQ = new IctOrderInfoByUserRQ2();
		ictOrderInfoByUserRQ.setPassengerIdNo("");
		ictOrderInfoByUserRQ.setPassengerIDType("");
		ictOrderInfoByUserRQ.setPlatSequenceNo("");
		ictOrderInfoByUserRQ.setReserverIdNo("130526199210234210");
		ictOrderInfoByUserRQ.setReserverIDType("1");
		ictOrderInfoByUserRQ.setReserveTimeFrom("20160203");
		ictOrderInfoByUserRQ.setReserveTimeTo("20160304");
		ictOrderInfoByUserRQ.setSaleMode("9");
		ictOrderInfoByUserRQ.setSequenceNo("");
		ictOrderInfoByUserRQ.setTrainDate("00000000");
		try{
			IctOrderInfoByUserRS2 rs = port.ictOrderInfoByUser(ictOrderInfoByUserRQ);
			if (rs != null) {
				logger.info(getStringDate()+"综合查询接口正常");
				System.out.println(getStringDate()+"综合查询接口正常");
				return true;
			}
			return false;
		}catch(Exception e){
			logger.error(getStringDate()+"铁科综合查询接口异常"+e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * postTVM接口
	 * 
	 * @return 接口是否正常
	 */
	public boolean postTVMMonitor() {
		QueryPOSTVM_Service postvmService = new QueryPOSTVM_Service();
		postvmService.setHandlerResolver(myHandlerResolver);// 配置
		ICTPOSTVMQueryServiceEndPoint port = postvmService
				.getICTPOSTVMQueryServiceEndPointPort();
		String saleDateFrom="20160203";
		String saleDataTo="20160304";
		String idType="1";
		String idNo="130526199210234210";
		String tradeNo="";
		try{
			IctQueryPOSTVMTransactionInfoByTicketInfoRes ticketInfoRes = port
					.queryPOSTVMByPassengerAndTrade(saleDateFrom, saleDataTo,
							idType, idNo, tradeNo);
			if(ticketInfoRes!=null){
				logger.info(getStringDate()+"POSTVM接口正常");
				System.out.println(getStringDate()+"POSTVM接口正常");
				return true;
			}
			return false;
		}catch(Exception e){
			logger.error(getStringDate()+"铁科POSTVM接口异常"+e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	public boolean JpkServiceMonitor(){
		
		TRSForCustomerSupportCenterServices2Service trsFCSCenter = new TRSForCustomerSupportCenterServices2Service();
		trsFCSCenter.setHandlerResolver(myHandlerResolver);//安全平台配置
		TRSForCustomerSupportCenterServices2Delegate port = trsFCSCenter.getTRSForCustomerSupportCenterServices2DelegatePort();
		try{
			IctCheckTicketPlatForm ictCheckTicketPlatForm = port.queryCheckTicketInfo("20160303","G88","西安北");
			if (ictCheckTicketPlatForm != null) {
				logger.info(getStringDate()+"检票口接口正常");
				System.out.println(getStringDate()+"检票口接口正常");
				return true;
			}
			return false;
		}catch(Exception e){
			logger.error(getStringDate()+"检票口接口异常"+e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * 拼音码接口
	 * 
	 * @return 接口是否正常
	 */
	
	public boolean dictServiceMonitor() {
		DictService_Service service = new DictService_Service();
		service.setHandlerResolver(myHandlerResolver);
		DictService port = service.getDictServiceImplPort();
		try{
			RsInfo info = port.queryStationNamesByPym("bj");
			if (info != null) {
				logger.info(getStringDate()+"拼音码接口正常");
				return true;
			}
			return false;
		}catch(Exception e){
			logger.error(getStringDate()+"后台拼音码接口异常"+e.getMessage());
			e.printStackTrace();
			return false;
		}
		
	}
	
	public RsInfo queryStationNamesByPym() {
		DictService_Service service = new DictService_Service();
		service.setHandlerResolver(SecurityPlatform.getMyHandlerResolver());
		DictService port = service.getDictServiceImplPort();
		RsInfo info = port.queryStationNamesByPym("bj");
		return info;
	}
	
	 public String getStringDate() {
		  Date currentTime = new Date();
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  String dateString = formatter.format(currentTime);
		  return dateString;
		 }

	public static void main(String[] args) {
//		InterfaceMonitor.getInstance().dictServiceMonitor();
//		InterfaceMonitor.getInstance().realnameMonitor();
		InterfaceMonitor.getInstance().zhcxMonitor();
//		InterfaceMonitor.getInstance().postTVMMonitor();
	}

}
