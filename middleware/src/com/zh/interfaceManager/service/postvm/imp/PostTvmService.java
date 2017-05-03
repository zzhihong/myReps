package com.zh.interfaceManager.service.postvm.imp;

import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.apache.log4j.Logger;

import com.chunyv.ws.handler.MyHandlerResolver;
import com.zh.interfaceManager.client.common.Header;
import com.zh.interfaceManager.client.postvm.BoICTQueryPOSTVMTransactionInfoByTicketInfo;
import com.zh.interfaceManager.client.postvm.ICTPOSTVMQueryServiceEndPoint;
import com.zh.interfaceManager.client.postvm.PosTvmEntity;
import com.zh.interfaceManager.client.postvm.PosTvmResult;
import com.zh.interfaceManager.client.postvm.QueryPOSTVM_Service;
import com.zh.interfaceManager.service.postvm.IPostTvmService;
import com.zh.monitor.SecurityPlatform;
import com.zh.monitor.State;

public class PostTvmService implements IPostTvmService{
	private static volatile PostTvmService postvm ; 
	private static MyHandlerResolver myHandlerResolver=SecurityPlatform.getMyHandlerResolver();
	private int time=1000*10;
	private static final Logger logger = Logger.getLogger(PostTvmService.class);
	private volatile ICTPOSTVMQueryServiceEndPoint port;
	 

	
	public static PostTvmService getPosTvm(){
		if(postvm==null){
			return postvm = new PostTvmService();
		}
		return postvm;
		
	}
	private PostTvmService(){
		init();
	}
		

	private void init() {
		QueryPOSTVM_Service postvmService = new QueryPOSTVM_Service();
		postvmService.setHandlerResolver(myHandlerResolver);
		port = postvmService.getICTPOSTVMQueryServiceEndPointPort();
				
		
		
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
	public PosTvmResult QuerypostTVM(PosTvmEntity pt){
		PosTvmResult result = new PosTvmResult();
		Header header = new Header();
		String state = State.postTMVStateMonitor();
		
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			result.setHeader(header);
			logger.error(state);
			return result;
			
		}
		List<BoICTQueryPOSTVMTransactionInfoByTicketInfo> list = null;
	
			addTimeLimit();
			try{
				list = port.queryPOSTVMByPassengerAndTrade(pt.getSaleDateFrom(),pt.getSaleDataTo(),pt.getIdType(),pt.getIdNo(),pt.getTradeNo())
							.getBody().getListPOSTVMTransactionInfo();
			
			if(port.queryPOSTVMByPassengerAndTrade(pt.getSaleDateFrom(),pt.getSaleDataTo(),pt.getIdType(),pt.getIdNo(),pt.getTradeNo())
					.getBody()!=null){
				if(list==null){
					header.setMsg("该查询条件没有返回结果");
					header.setStatus(false);
					result.setHeader(header);
					
				}else{
					if(list.size()==0){
						header.setMsg("该查询条件没有返回结果");
						header.setStatus(false);
						result.setHeader(header);	
					}else{
						header.setMsg("查询成功");
						result.setHeader(header);
						result.setList(list);
					}
				}
			}
			}
			catch(Exception ex){
				init();
				logger.error(" PostTvmService ...."+ex.getClass().getSimpleName()+"异常");
				if(ex instanceof WebServiceException){
					header.setStatus(false);
					header.setMsg("POS\\TVM查询时间超时，请再次查询....." );
					logger.error("异常类为：POS\\TVM查询时间超时..."+"入参为"+pt);
					result.setHeader(header);
				}else{
					header.setStatus(false);
					logger.error("铁科接口异常，异常类为："+ex.getClass().getSimpleName());
					header.setMsg("铁科接口异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
					result.setHeader(header);
				}
			}
			return result;
	}
}
