package com.zh.interfaceManager.service.pym;

import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.apache.log4j.Logger;

import com.chunyv.ws.handler.MyHandlerResolver;
import com.zh.interfaceManager.client.common.Header;
import com.zh.interfaceManager.client.pym.DictService;
import com.zh.interfaceManager.client.pym.DictService_Service;
import com.zh.interfaceManager.client.pym.ObjRsInfo;
import com.zh.interfaceManager.client.pym.PymTest;
import com.zh.interfaceManager.client.pym.RsInfo;
import com.zh.monitor.SecurityPlatform;
import com.zh.monitor.State;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月9日下午6:09:11
 *@version: V1.0
 *@Description:
 */
public class PYM {
	
	private static volatile PYM pym;
	private static MyHandlerResolver myHandlerResolver=SecurityPlatform.getMyHandlerResolver();
	private int time=1000*10;
	private Logger logger = Logger.getLogger(this.getClass());
	private volatile DictService port;
	public static PYM getpym(){
		if(pym==null){
			return pym = new PYM();
		}
		return pym;
		
	}
	private PYM(){
		init();
	}
	
	private void init() {
		DictService_Service service = new DictService_Service();
		service.setHandlerResolver(myHandlerResolver);
		port = service.getDictServiceImplPort();
				
		
		
	}
	public void addTimeLimit(){
		Map<String, Object> ctxt = ((BindingProvider) port).getRequestContext();  
		ctxt.put("com.sun.xml.internal.ws.connect.timeout", time);  
		ctxt.put("com.sun.xml.internal.ws.request.timeout", time);
	}
	
	/**
	 * 拼音码接口
	 * 
	 * @return 接口是否正常
	 */
	
	public ObjRsInfo queryStationNamesByPym(PymTest pym) {
		System.out.println(pym.getPym());
		ObjRsInfo ori = new ObjRsInfo();
		Header header = new Header();
		String state = State.pymStateMonitor();
		
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			ori.setHeader(header);
			logger.error(state);
			return ori;
			
		}
		addTimeLimit();
		RsInfo ri = null;
		try{
		ri = port.queryStationNamesJsonByPym(pym.getPym());
		ori.setRsinfo(ri);
		if(ri.getBody()==null){
			header.setMsg("该查询条件没有返回结果");
			header.setStatus(false);
			ori.setHeader(header);
			
		}else{
			header.setMsg("查询成功");
			ori.setHeader(header);
		}
	}catch(Exception ex){
		init();
		logger.error(" PYM ...."+ex.getClass().getSimpleName()+"异常");
		if(ex instanceof WebServiceException){
			header.setStatus(false);
			header.setMsg("PYM查询时间超时，请再次查询....." );
			logger.error("异常类为：PYM查询时间超时...");
			ori.setHeader(header);
		}else{
			header.setStatus(false);
			logger.error("铁科接口异常，异常类为："+ex.getClass().getSimpleName());
			header.setMsg("铁科接口异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
			ori.setHeader(header);
		}
	}
	return ori;
}
}
