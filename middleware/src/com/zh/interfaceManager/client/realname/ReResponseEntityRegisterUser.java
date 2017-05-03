package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.config.ExceptionMes;
import com.zh.interfaceManager.client.realname.ResponseEntityRegisterUser;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月10日上午10:32:18
 *@version: V1.0
 *@Description:
 */
@SuppressWarnings("serial")
public class ReResponseEntityRegisterUser implements Serializable{
	private ResponseEntityRegisterUser re;
	
	public ResponseEntityRegisterUser getRe() {
		return re;
	}
	public void setRe(ResponseEntityRegisterUser re) {
		this.re = re;
	}
	private Header header;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	@Override
	public String toString() {
		return "ReResponseEntityRegisterUser [re=" + re + ", header=" + header
				+ "]";
	}

}
