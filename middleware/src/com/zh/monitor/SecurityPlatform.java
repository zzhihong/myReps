package com.zh.monitor;

import java.io.File;
import java.net.MalformedURLException;

import com.chunyv.ssl.factory.MySSLSocketFactory;
import com.chunyv.token.TokenHandler;
import com.chunyv.token.TokenTimerHandler;
import com.chunyv.ws.handler.MyHandlerResolver;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月9日下午3:11:59
 *@version: V1.0
 *@Description: 安全平台的启动
 */
public class SecurityPlatform {
	
	private static MyHandlerResolver myHandlerResolver;
	
	public static MyHandlerResolver getMyHandlerResolver() {
		if(myHandlerResolver==null){
			initGetToken();
		}
		return myHandlerResolver;
	}

	private static SecurityPlatform sp;
	
	/**
	 * 启动安全平台的获取token程序  擦 用单例来保护。。。。
	 */
	public static SecurityPlatform initGetToken(){
		if(sp==null)
			return sp = new SecurityPlatform();
		else
			return sp;
	}
	
	private SecurityPlatform(){//只能执行一次  所以设单例保护
		MySSLSocketFactory mySSLSocketFactory = new MySSLSocketFactory();
		mySSLSocketFactory.setCertFile(new File("C:\\keystore.mor"));
		mySSLSocketFactory.setCertPassWord("12345678");
		mySSLSocketFactory.init();
		TokenHandler tokenHandler = new TokenHandler();
		try {
			tokenHandler.setAmHost("eaccess.china-railway.com.cn");
		} catch (MalformedURLException e) {
		}
		tokenHandler.setMsf(mySSLSocketFactory);

		TokenTimerHandler tokenTimerHandler = new TokenTimerHandler();
		tokenTimerHandler.setTokenHandler(tokenHandler);
		tokenTimerHandler.setTokenUpdateTime(660L);
		tokenTimerHandler.setTokenUpdateFastTime(1L);
		tokenTimerHandler.init();

		myHandlerResolver = new MyHandlerResolver();
		myHandlerResolver.setTokenHandler(tokenTimerHandler);
	}
	public static void main(String[] args) {
		
		SecurityPlatform.initGetToken();
		System.out.println("aaa");
		System.out.println(myHandlerResolver.getTokenHandler().getToken());
	}
}
