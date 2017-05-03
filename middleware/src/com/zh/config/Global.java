package com.zh.config;



/**
 * 系统配置类
 * @author chl
 *
 */
public class Global {
	
	/**
	 * 当前对象实例
	 */
	private static Global global = new Global();
	
	/**
	 * 获取当前对象实例
	 */
	public static Global getInstance() {
		return global;
	}
	

}
