package com.zh.interfaceManager.service.jpk.imp;

import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.apache.log4j.Logger;

import com.chunyv.ws.handler.MyHandlerResolver;
import com.zh.interfaceManager.client.common.Header;
import com.zh.interfaceManager.client.jpk.IctCheckTicketPlatForm;
import com.zh.interfaceManager.client.jpk.JpkResult;
import com.zh.interfaceManager.client.jpk.TRSForCustomerSupportCenterServices2Delegate;
import com.zh.interfaceManager.client.jpk.TRSForCustomerSupportCenterServices2Service;
import com.zh.interfaceManager.client.jpk.Ticket_entrance;
import com.zh.interfaceManager.client.jpk.Wb10TrainPlatform;
import com.zh.interfaceManager.service.jpk.IJpkService;
import com.zh.monitor.SecurityPlatform;
import com.zh.monitor.State;


public class JpkService implements IJpkService{
	private static final Logger logger = Logger.getLogger(JpkService.class);
	public static volatile JpkService jpkService;
	public static MyHandlerResolver myHandlerResolver = SecurityPlatform.getMyHandlerResolver();
	private volatile TRSForCustomerSupportCenterServices2Delegate port;
	private int time = 1000*10;
	private JpkService() {
		super();
		init();
	} 

	private void init() {
		TRSForCustomerSupportCenterServices2Service trsFCSCenter = new TRSForCustomerSupportCenterServices2Service();
		trsFCSCenter.setHandlerResolver(myHandlerResolver);//安全平台配置
	    port = trsFCSCenter.getTRSForCustomerSupportCenterServices2DelegatePort();
		
	}

	public static JpkService getJpkService(){
		if(jpkService==null){
			
			return jpkService = new JpkService();
		}
		return jpkService;
	}
	
	/**
	 * 给接口加上超时限制
	 */
	public void addTimeLimit(){
		Map<String, Object> ctxt = ((BindingProvider) port).getRequestContext();  
		ctxt.put("com.sun.xml.internal.ws.connect.timeout", time);  
		ctxt.put("com.sun.xml.internal.ws.request.timeout", time);
	}
	
	/**
	 * 正常调用接口过程   收到一个调用接口请求  先根据接口监控状态   看是否真调用   如果接口监控为异常  则直接返回监控信息
	 * 是铁科接口异常还是安全平台问题 然后在调用接口   调用接口的时候在加上一个10s无返回这个状态判断 如果10s返回正常
	 * 则正常返回   如果捕获到10s无返回   还是返回10s无返回状态
	 * 自己封装返回类？或者正常返回原类  异常返回字符串
	 */
	public JpkResult getCheckTicketWebService(Ticket_entrance jpk) {
		JpkResult result = new JpkResult();
		Header header = new Header();
		String state = State.jpkStateMonitor();
		if(!"OK".equals(state)){
			logger.error(state);
			header.setStatus(false);
			header.setMsg(state);
			result.setHeader(header);
			return result;
		}
		try{
			IctCheckTicketPlatForm ictCheckTicketPlatForm = port.queryCheckTicketInfo(jpk.getTrain_date(), jpk.getStation_train_code(), jpk.getStation_telecode());
			List<Wb10TrainPlatform> list = null;
			
			if(ictCheckTicketPlatForm!=null){
				list = ictCheckTicketPlatForm.getTrainPlatFormList();
				if(list==null){
					header.setMsg("检票口该查询条件没有返回结果");
					header.setStatus(false);
					result.setHeader(header);
				}else{
					if(list.size()==0){
						header.setMsg("检票口该查询条件没有返回结果");
						header.setStatus(false);
						result.setHeader(header);	
					}else{
						header.setMsg("检票口查询成功");
						result.setHeader(header);
						result.setList(list);
					}
				}
			}
		}catch(Exception ex){
			init();
			logger.error(" JpkService...."+ex.getClass().getSimpleName()+"异常");
			if(ex instanceof WebServiceException){
				logger.error("异常类为：检票口查询时间超时...");
				header.setStatus(false);
				header.setMsg("检票口查询时间超时，请再次查询....."+"入参为"+jpk );
				result.setHeader(header);
			}else{
				logger.error("铁科接口异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
				header.setStatus(false);
				header.setMsg("铁科接口异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
				result.setHeader(header);
			}
			
		}
		return result;
	}
}
