package com.zh.monitor;
/**
 *@author: baijiangtao
 *@createtime: 2016年2月29日下午2:16:58
 *@version: V1.0
 *@Description:监控的一些状态  根据状态来提醒系统是否正常
 */
public class State {
	/**
	 * 想着状态要不要来个等级什么的   所以使用int    暂无等级概念    0表示异常   5表示正常
	 * 初始化全部接口正常 
	 */
	//安全平台状态
	private static int securityState=5;
	//实名制接口状态
	private static int realnameState=5;
	//postTVM接口
	private static int postTMVState=5;
	//订票订单接口
	private static int zhcxState=5;
	//拼音码接口
	private static int pymState=5;
	//安全平台的上一个状态
	private static int beforeSecurityState=5;
	//检票口接口
	private static int jpkState=5;
	
	public static int getJpkState() {
		return jpkState;
	}
	public static void setJpkState(int jpkState) {
		State.jpkState = jpkState;
	}
	public static int getBeforeSecurityState() {
		return beforeSecurityState;
	}
	public static void setBeforeSecurityState(int beforeSecurityState) {
		State.beforeSecurityState = beforeSecurityState;
	}
	public static int getSecurityState() {
		return securityState;
	}
	public static void setSecurityState(int securityState) {
		State.securityState = securityState;
	}
	public static int getRealnameState() {
		return realnameState;
	}
	public static void setRealnameState(int realnameState) {
		State.realnameState = realnameState;
	}
	public static int getPostTMVState() {
		return postTMVState;
	}
	public static void setPostTMVState(int postTMVState) {
		State.postTMVState = postTMVState;
	}
	public static int getZhcxState() {
		return zhcxState;
	}
	public static void setZhcxState(int zhcxState) {
		State.zhcxState = zhcxState;
	}
	public static int getPymState() {
		return pymState;
	}
	public static void setPymState(int pymState) {
		State.pymState = pymState;
	}
	/**
	 * 启动平台接口   强制把所有接口设为正常
	 */
	public void startPlatform(){
		securityState=5;
		//实名制接口状态
		realnameState=5;
		//postTVM接口
		postTMVState=5;
		//综合查询接口
		zhcxState=5;
		//拼音码接口
		pymState=5;
		jpkState=5;

	}
	/**
	 * 停止平台接口  把所有接口状态设为不正常
	 */
	public void stopPlatform(){
		securityState=0;
		//实名制接口状态
		realnameState=0;
		//postTVM接口
		postTMVState=0;
		//综合查询接口
		zhcxState=0;
		//拼音码接口
		pymState=0;
		jpkState=0;

	}
	
	/**
	 * 业务层调用接口   安全平台是否正常
	 * 从业务层考虑调用的话    
	 * @return
	 */
	public boolean isSCNormal(){
		
		if(securityState==0){
			return false;
		}else{
			return true;
		}
		
	}
	
	/**
	 * 实名制接口对监控状态的访问
	 * @return
	 */
	public static String realnameStateMonitor(){
		if(securityState==5){
			if(realnameState==5){
				return "OK";
			}else{
				return "铁科实名制接口有问题";
			}
		}else
			return "安全平台有问题";
	}
	/**
	 * POSTVM接口对监控状态的访问
	 * @return
	 */
	public static String postTMVStateMonitor(){
		if(securityState==5){
			if(postTMVState==5){
				return "OK";
			}else{
				return "铁科POSTVM接口有问题";
			}
		}else
			return "安全平台有问题";
	}
	
	/**
	 * 订票订单接口对监控状态的访问
	 * @return
	 */
	public static String dpddStateMonitor(){
		if(securityState==5){
			if(zhcxState==5){
				return "OK";
			}else{
				return "铁科订票订单接口有问题";
			}
		}else
			return "安全平台有问题";
	}
	
	/**
	 * 检票口接口
	 * @return
	 */
	public static String jpkStateMonitor(){
		if(securityState==5){
			if(jpkState==5){
				return "OK";
			}else{
				return "铁科检票口接口有问题";
			}
		}else
			return "安全平台有问题";
	}
	
	public static String pymStateMonitor(){
		if(securityState==5){
			if(pymState==5){
				return "OK";
			}else{
				return "铁科拼音码接口有问题";
			}
		}else
			return "安全平台有问题";
	}
	

}
