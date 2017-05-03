package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import com.zh.interfaceManager.client.realname.ResponseEntityPassenger;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月10日下午3:57:26
 *@version: V1.0
 *@Description:
 */
public class ReResponseEntityPassenger implements Serializable{
	private static final long serialVersionUID = 1L;
	private ResponseEntityPassenger re;
	private Header header;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public ResponseEntityPassenger getRe() {
		return re;
	}
	public void setRe(ResponseEntityPassenger re) {
		this.re = re;
	}
	
}
