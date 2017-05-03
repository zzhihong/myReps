package com.zh.interfaceManager.service.realname.impl;

import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.apache.log4j.Logger;

import com.chunyv.ws.handler.MyHandlerResolver;
import com.zh.interfaceManager.client.realname.CommonHeader;
import com.zh.interfaceManager.client.realname.Header;
import com.zh.interfaceManager.client.realname.ManageUserInfoWebServiceWS;
import com.zh.interfaceManager.client.realname.ManageUserInfoWebServiceWSDelegate;
import com.zh.interfaceManager.client.realname.POPhoneVerificationCode;
import com.zh.interfaceManager.client.realname.POQueryBundlingMobile;
import com.zh.interfaceManager.client.realname.POQueryUserInfo;
import com.zh.interfaceManager.client.realname.ReResponseEntityLogOutRegisterUser;
import com.zh.interfaceManager.client.realname.ReResponseEntityPassenger;
import com.zh.interfaceManager.client.realname.ReResponseEntityPhoneVerificationCode;
import com.zh.interfaceManager.client.realname.ReResponseEntityRegisterUser;
import com.zh.interfaceManager.client.realname.ReResponseEntityReisterUser;
import com.zh.interfaceManager.client.realname.ReResponseEntityVerifyMobile;
import com.zh.interfaceManager.client.realname.RegisterUser;
import com.zh.interfaceManager.client.realname.ResponseEntityLogOutRegisterUser;
import com.zh.interfaceManager.client.realname.ResponseEntityPassenger;
import com.zh.interfaceManager.client.realname.ResponseEntityPhoneVerificationCode;
import com.zh.interfaceManager.client.realname.ResponseEntityRegisterUser;
import com.zh.interfaceManager.client.realname.ResponseEntityReisterUser;
import com.zh.interfaceManager.client.realname.ResponseEntityVerifyMobile;
import com.zh.interfaceManager.client.realname.POSynchronizedUserByRegister;
import com.zh.interfaceManager.client.realname.POUnbundlMobile;
import com.zh.interfaceManager.client.realname.POVerifyRegisterUserStatus;
import com.zh.interfaceManager.service.realname.IRealName;
import com.zh.monitor.SecurityPlatform;
import com.zh.monitor.State;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月9日上午11:16:42
 *@version: V1.0
 *@Description: 单例  调用接口
 */
public class RealName implements IRealName{
	private static final Logger logger=Logger.getLogger(RealName.class);
	private static MyHandlerResolver myHandlerResolver=SecurityPlatform.getMyHandlerResolver();
	private static RealName realname;
	
	private RealName(){
		init();
	}
	
	public static RealName getInstance(){
		if(realname==null)
			return realname = new RealName();
		else 
			return realname;
	}
	
	private volatile ManageUserInfoWebServiceWSDelegate port;
	
	private int time=1000*10;
	
	private void init(){
		ManageUserInfoWebServiceWS service = new ManageUserInfoWebServiceWS();
		service.setHandlerResolver(myHandlerResolver);
		ManageUserInfoWebServiceWSDelegate delegate = service
				.getManageUserInfoWebServiceWSDelegatePort();
		port=delegate;
	}
	
	/**
	 * 正常调用接口过程   收到一个调用接口请求  先根据接口监控状态   看是否真调用   如果接口监控为异常  则直接返回监控信息
	 * 是铁科接口异常还是安全平台问题    然后在调用接口   调用接口的时候在加上一个10s无返回这个状态判断   如果10s返回正常
	 * 则正常返回   如果捕获到10s无返回   还是返回10s无返回状态
	 * 自己封装返回类？或者正常返回原类  异常返回字符串
	 */
	
	private void addTimeLimit(){
		Map<String, Object> ctxt = ((BindingProvider) port).getRequestContext();  
		ctxt.put("com.sun.xml.internal.ws.connect.timeout", time);  
		ctxt.put("com.sun.xml.internal.ws.request.timeout", time);
	}
	

	@Override
	public ReResponseEntityRegisterUser ictQueryUserInfo(POQueryUserInfo po) {
		ReResponseEntityRegisterUser re=new ReResponseEntityRegisterUser();
		Header header = new Header();
		String state = State.realnameStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			re.setHeader(header);
			return re;
		}
		addTimeLimit();
		ResponseEntityRegisterUser user=null;
		String tip="";
		try{
			user = port.ictQueryUserInfo(po.getCommonHeader(),po.getRegisterUser(), po.getTranData());
			re.setHeader(header);
			re.setRe(user);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				tip = "调用实名制接口ictQueryUserInfo:"+time/1000+"s内无返回，请再次查询....." ; 
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error("调用实名制接口ictQueryUserInfo:"+time/1000+"s内无返回，请再次查询....."+"入参为"+po);
			}else{
				tip = "调用实名制接口ictQueryUserInfo异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科";
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error("调用实名制接口ictQueryUserInfo异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科");
			}
		}
		return re;
	}

	@Override
	public ReResponseEntityPassenger getPassengerInfosFromWebService(POQueryUserInfo po) {
		ReResponseEntityPassenger re=new ReResponseEntityPassenger();
		Header header = new Header();
		String state = State.realnameStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			re.setHeader(header);
			return re;
		}
		addTimeLimit();
		ResponseEntityPassenger response=null;
		String tip="";
		try{
			response = port.ictQueryPassengerInfo(
					po.getCommonHeader(), po.getRegisterUser(), po.getTranData());
			re.setHeader(header);
			re.setRe(response);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				tip = "调用实名制接口ictQueryPassengerInfo:"+time/1000+"s内无返回，请再次查询....." ; 
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip+"入参为"+po);
			}else{
				tip = "调用实名制接口ictQueryPassengerInfo异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科";
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip);
			}
		}
		return re;
	}

	@Override
	public ReResponseEntityLogOutRegisterUser logOutRegisterUser(POQueryUserInfo po) {
		ReResponseEntityLogOutRegisterUser re=new ReResponseEntityLogOutRegisterUser();
		Header header = new Header();
		String state = State.realnameStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			re.setHeader(header);
			return re;
		}
		addTimeLimit();
		ResponseEntityLogOutRegisterUser logOutUser=null;
		String tip="";
		try{
			logOutUser = port.ictLogOutUser(
					po.getCommonHeader(), po.getRegisterUser(), po.getTranData());
			re.setHeader(header);
			re.setRe(logOutUser);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				tip = "调用实名制接口ictLogOutUser:"+time/1000+"s内无返回，请再次查询....." ; 
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip+"入参为"+po);
			}else{
				tip = "调用实名制接口ictLogOutUser异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科";
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip);
			}
		}
		return re;
	}

	@Override
	public ReResponseEntityReisterUser getVerifyRegisterUserStatus(POVerifyRegisterUserStatus po) {
		ReResponseEntityReisterUser re=new ReResponseEntityReisterUser();
		Header header = new Header();
		String state = State.realnameStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			re.setHeader(header);
			return re;
		}
		addTimeLimit();
		ResponseEntityReisterUser user=null;
		String tip="";
		try{
			user = port.ictVerifyRegisterUserStatus(
					po.getCommonHeader(), po.getRegisterIdNo(), po.getRegisterName(), 
					po.getRealName(), po.getIdType(), po.getIdNo(), po.getCountryCode());
			re.setHeader(header);
			re.setRe(user);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				tip = "调用实名制接口ictVerifyRegisterUserStatus:"+time/1000+"s内无返回，请再次查询....." ; 
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip+"入参为"+po);
			}else{
				tip = "调用实名制接口ictVerifyRegisterUserStatus异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科";
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip);
			}
		}
		return re;
	}

	@Override
	public ReResponseEntityReisterUser getSynchronizedUserByRegister(POSynchronizedUserByRegister po) {
		ReResponseEntityReisterUser re=new ReResponseEntityReisterUser();
		Header header = new Header();
		String state = State.realnameStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			re.setHeader(header);
			return re;
		}
		addTimeLimit();
		ResponseEntityReisterUser user=null;
		String tip="";
		try{			
			user = port.ictSynchronizedUserByRegister(
					po.getCommonHeader(), po.getIdType(), po.getIdNo(), po.getPhone(), po.getRegisterUserName());
			re.setHeader(header);
			re.setRe(user);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				tip = "调用实名制接口getSynchronizedUserByRegister:"+time/1000+"s内无返回，请再次查询....." ; 
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip+"入参为"+po);
			}else{
				tip = "调用实名制接口getSynchronizedUserByRegister异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科";
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip);
			}
		}
		return re;
	}

	@Override
	public ReResponseEntityPhoneVerificationCode getPhoneVerificationCode(POPhoneVerificationCode po) {
		ReResponseEntityPhoneVerificationCode re=new ReResponseEntityPhoneVerificationCode();
		Header header = new Header();
		String state = State.realnameStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			re.setHeader(header);
			return re;
		}
		addTimeLimit();
		ResponseEntityPhoneVerificationCode user=null;
		String tip="";
		try{
			user = port.ictGetPhoneVerificationCode(po.getCommonHeader(), po.getPhone());
			re.setHeader(header);
			re.setRe(user);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				tip = "调用实名制接口getPhoneVerificationCode:"+time/1000+"s内无返回，请再次查询....." ; 
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip+"入参为"+po);
			}else{
				tip = "调用实名制接口getPhoneVerificationCode异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科";
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip);
			}
		}
		return re;
	}
	
	@Override
	public ReResponseEntityRegisterUser ictQueryBundlingMobile(
			POQueryBundlingMobile po) {
		ReResponseEntityRegisterUser re=new ReResponseEntityRegisterUser();
		Header header = new Header();
		String state = State.realnameStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			re.setHeader(header);
			return re;
		}
		addTimeLimit();
		ResponseEntityRegisterUser user=null;
		String tip="";
		try{
			user = port.ictQueryBundlingMobile(po.getCommonHeader(), po.getComplaintIdType(),po.getComplaintIdNo(),po.getPhone());
			re.setHeader(header);
			re.setRe(user);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				tip = "调用实名制接口ictQueryBundlingMobile:"+time/1000+"s内无返回，请再次查询....." ; 
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip+"入参为"+po);
			}else{
				tip = "调用实名制接口ictQueryBundlingMobile异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科";
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip);
			}
		}
		return re;
	}
	
	@Override
	public ReResponseEntityVerifyMobile ictUnbundlMobile(POUnbundlMobile po) {
		ReResponseEntityVerifyMobile re=new ReResponseEntityVerifyMobile();
		Header header = new Header();
		String state = State.realnameStateMonitor();
		if(!"OK".equals(state)){
			header.setStatus(false);
			header.setMsg(state);
			re.setHeader(header);
			return re;
		}
		addTimeLimit();
		ResponseEntityVerifyMobile user=null;
		String tip="";
		try{
			user = port.ictUnbundlMobile(po.getCommonHeader(), po.getIdType(),po.getIdNo(),po.getPhone(),po.getTranData());
			re.setHeader(header);
			re.setRe(user);
		}catch(Exception ex){
			init();
			if(ex instanceof WebServiceException){
				tip = "调用实名制接口ictQueryBundlingMobile:"+time/1000+"s内无返回，请再次查询....." ; 
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip+"入参为"+po);
			}else{
				tip = "调用实名制接口ictQueryBundlingMobile异常，异常类为："+ex.getClass().getSimpleName()+",请联系铁科";
				header.setStatus(false);
				header.setMsg(tip);
				re.setHeader(header);
				logger.error(tip);
			}
		}
		return re;
	}
	
	public static void main(String[] args) {
		POQueryUserInfo po=new POQueryUserInfo();
		CommonHeader commonHeader = new CommonHeader();
		commonHeader.setBureauCode("P");
		commonHeader.setOperatorNo("10000");
		commonHeader.setSrcIP("10.1.126.155");
		RegisterUser registerUser =new RegisterUser();
		registerUser.setIdNo("130526199210234210");
		registerUser.setIdType("1");
		registerUser.setPhone("");
		String tranData="FVFNf0Ucuu2dpXIhv+7asfRJyx1O/eQUGmgORiKnnM/fwFl0PaozwmoMFj9YbjiV2Fb1++pu2ufu"
				+ "XsBh5naStunroNZ49IQl0ytvyOighjM68+eDPEbh4tyjz2RVtK0IXtoqsHgWB7HhBEQuggPnvUSWkPqMewDY"
				+ "p1EXSsqpiCLZd5uk/3T8crZK36gBT+KQXvi0tuMeaRiHprIm7sgrMwLz2uxSWyEdKehDoTE5HQwtG9DPBGvh4jO"
				+ "ZyLC+36dUXkBA58kpnyI0rzUpiSdUz/rS5etzYZTqeyYpTxTJyHWrRCdVVeDJOXWCL0A9pGxUbNtk5/qqY9JH/PGMs7xzqg==";
		po.setCommonHeader(commonHeader);
		po.setRegisterUser(registerUser);
		po.setTranData(tranData);
		ReResponseEntityRegisterUser userInfo = RealName.getInstance().ictQueryUserInfo(po);
		System.out.println(userInfo);
	}

	

	

}
