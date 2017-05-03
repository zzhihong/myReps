package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

/**
 *@author: baijiangtao
 *@createtime: 2016年3月10日下午5:02:21
 *@version: V1.0
 *@Description:
 */
public class Header implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private boolean status=true;
	private String msg;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Header [status=" + status + ", msg=" + msg + "]";
	}
	
}
