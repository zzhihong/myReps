package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.config.ExceptionMes;
import com.zh.interfaceManager.client.realname.ResponseEntityReisterUser;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月10日下午4:16:23
 *@version: V1.0
 *@Description:
 */
public class ReResponseEntityReisterUser implements Serializable{
	private static final long serialVersionUID = 1L;
	private ResponseEntityReisterUser re;
	public ResponseEntityReisterUser getRe() {
		return re;
	}
	public void setRe(ResponseEntityReisterUser re) {
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
