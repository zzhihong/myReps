package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.config.ExceptionMes;
import com.zh.interfaceManager.client.realname.ResponseEntityLogOutRegisterUser;


/**
 *@author: baijiangtao
 *@createtime: 2016年3月10日下午4:08:12
 *@version: V1.0
 *@Description:
 */
public class ReResponseEntityLogOutRegisterUser implements Serializable{
	private static final long serialVersionUID = 1L;
	private ResponseEntityLogOutRegisterUser re;
	public ResponseEntityLogOutRegisterUser getRe() {
		return re;
	}
	public void setRe(ResponseEntityLogOutRegisterUser re) {
		this.re = re;
	}
	private Header header;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	
}
