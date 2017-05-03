package com.zh.config;

import java.io.Serializable;

/**
 *@author: zzh
 *@createtime: 2016-3-8上午9:52:30
 *@version: V1.0
 *@Description:异常信息类
 */
@SuppressWarnings("serial")
public class ExceptionMes implements Serializable{
	private String mes;

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public ExceptionMes(String mes) {
		super();
		this.mes = mes;
	}

	public ExceptionMes() {
		super();
	}

	@Override
	public String toString() {
		return "ExceptionMes [mes=" + mes + "]";
	}
	
}

