package com.zh.server;

import java.io.Serializable;
import java.util.Date;

/**
 *@author: zzh
 *@createtime: 2016-2-29����3:10:30
 *@version: V1.0
 *@Description:
 */
public class TestPojo1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int shuzi;
	private String zifuchuan;
	private Date riqi;
	public void setShuzi(int shuzi) {
		this.shuzi = shuzi;
	}
	public void setZifuchuan(String zifuchuan) {
		this.zifuchuan = zifuchuan;
	}
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	public int getShuzi() {
		return shuzi;
	}
	public String getZifuchuan() {
		return zifuchuan;
	}
	public Date getRiqi() {
		return riqi;
	}
	public TestPojo1(int shuzi, String zifuchuan, Date riqi) {
		super();
		this.shuzi = shuzi;
		this.zifuchuan = zifuchuan;
		this.riqi = riqi;
	}
	public TestPojo1() {
		super();
	}
	@Override
	public String toString() {
		return "TestPojo1 [shuzi=" + shuzi + ", zifuchuan=" + zifuchuan
				+ ", riqi=" + riqi + "]";
	}
}

