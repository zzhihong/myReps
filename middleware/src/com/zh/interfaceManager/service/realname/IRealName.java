package com.zh.interfaceManager.service.realname;

import com.zh.interfaceManager.client.realname.POPhoneVerificationCode;
import com.zh.interfaceManager.client.realname.POQueryBundlingMobile;
import com.zh.interfaceManager.client.realname.POQueryUserInfo;
import com.zh.interfaceManager.client.realname.ReResponseEntityLogOutRegisterUser;
import com.zh.interfaceManager.client.realname.ReResponseEntityPassenger;
import com.zh.interfaceManager.client.realname.ReResponseEntityPhoneVerificationCode;
import com.zh.interfaceManager.client.realname.ReResponseEntityRegisterUser;
import com.zh.interfaceManager.client.realname.ReResponseEntityReisterUser;
import com.zh.interfaceManager.client.realname.ReResponseEntityVerifyMobile;
import com.zh.interfaceManager.client.realname.POSynchronizedUserByRegister;
import com.zh.interfaceManager.client.realname.POUnbundlMobile;
import com.zh.interfaceManager.client.realname.POVerifyRegisterUserStatus;

/**
 * @author: baijiangtao
 * @createtime: 2016年3月9日上午11:08:53
 * @version: V1.0
 * @Description: 实名制所有接口
 */
public interface IRealName {
	
	/**生产  获取注册人信息*/
	ReResponseEntityRegisterUser ictQueryUserInfo(POQueryUserInfo po);
	
	/** 生产 获取常用联系人信息*/
	ReResponseEntityPassenger getPassengerInfosFromWebService(POQueryUserInfo po);

	/** 生产 注销用户*/
	ReResponseEntityLogOutRegisterUser logOutRegisterUser(POQueryUserInfo po);

	/** 提交验证用户信息*/
	ReResponseEntityReisterUser getVerifyRegisterUserStatus(POVerifyRegisterUserStatus po);

	/** 同步常用联系人信息*/
	ReResponseEntityReisterUser getSynchronizedUserByRegister(POSynchronizedUserByRegister po);

	/** 获取验证码*/
	ReResponseEntityPhoneVerificationCode getPhoneVerificationCode(POPhoneVerificationCode po);
	/**根据手机号查询绑定人信息*/
	ReResponseEntityRegisterUser ictQueryBundlingMobile(POQueryBundlingMobile po);
	/**进行手机号解绑*/
	ReResponseEntityVerifyMobile ictUnbundlMobile(POUnbundlMobile po);
	
}
