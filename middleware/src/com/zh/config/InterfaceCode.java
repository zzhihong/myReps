package com.zh.config;
/**
 *@author: zzh
 *@createtime: 2016-2-29下午3:08:29
 *@version: V1.0
 *@Description:接口对应的标识码
 */
public class InterfaceCode {



	public static final int queryStationNamesByPym=5;//调用拼音码接口码
	public static final int getInsuranceWebService=6;//调用返回多个保险单接口码
	public static final int getIctInsuranceRRT=7;//调用返回单个保险单接口码
	public static final int getWWWZhcxFromWebService=8;//调用订票订单接口码
	public static final int queryPOSTVMByPassengerAndTrade=9;//调用POS\TVM接口码
	public static final int jpkCode=10;//调用检票口接口码
	public static final int getDealInfoWebService=11;//交易信息接口
	public static final int exceptionCode=99;//中间件错误码

	
	public static final int queryUserInfo=21;//实名制接口    获取注册人信息
	public static final int passengerInfosFromWebService=22;//实名制接口   获取常用联系人信息
	public static final int logOutRegisterUser=23;//实名制接口   注销用户
	public static final int getVerifyRegisterUserStatus=24;//实名制接口   提交验证用户信息
	public static final int getSynchronizedUserByRegister=25;//实名制接口   同步常用联系人信息
	public static final int getPhoneVerificationCode=26;//实名制接口   获取验证码
	public static final int queryBundlingMobile=27;//实名制接口   根据手机号查询用户注册信息
	public static final int unbundlMobile=28;//实名制接口   手机号绑定解绑
	
	public static final int testNetty=9999;


}

