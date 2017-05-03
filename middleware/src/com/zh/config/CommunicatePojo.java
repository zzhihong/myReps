package com.zh.config;

import java.io.Serializable;

/**
 *@author: zzh
 *@createtime: 2016-2-29下午4:44:45
 *@version: V1.0
 *@Description:用于与展示层通信的类
 */
public class CommunicatePojo<T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private T o;//封装了参数类
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public T getO() {
		return o;
	}
	public void setO(T o) {
		this.o = o;
	}
	public CommunicatePojo(int code, T o) {
		super();
		this.code = code;
		this.o = o;
	}
	public CommunicatePojo() {
		super();
	}
	@Override
	public String toString() {
		return "CommunicatePojo [code=" + code + ", o=" + o + "]";
	}
	
}

