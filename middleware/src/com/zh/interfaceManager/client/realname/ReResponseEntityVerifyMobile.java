package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.interfaceManager.client.realname.ResponseEntityVerifyMobile;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月11日上午10:44:13
 *@version: V1.0
 *@Description:
 */
public class ReResponseEntityVerifyMobile implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private ResponseEntityVerifyMobile re;
	private Header header;
	public ResponseEntityVerifyMobile getRe() {
		return re;
	}
	public void setRe(ResponseEntityVerifyMobile re) {
		this.re = re;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}

}
