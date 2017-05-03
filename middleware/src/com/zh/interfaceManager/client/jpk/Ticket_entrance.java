package com.zh.interfaceManager.client.jpk;

import java.io.Serializable;



/**
 * 检票口参数实体类
 * @author hankeke
 *
 */
public class Ticket_entrance implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String train_date; // 乘车日期;
	private String station_train_code; // 站车次;
	private String station_telecode; // 车站电报码;
	public Ticket_entrance(String train_date, String station_train_code,
			String station_telecode) {
		super();
		this.train_date = train_date;
		this.station_train_code = station_train_code;
		this.station_telecode = station_telecode;
	}
	public String getTrain_date() {
		return train_date;
	}
	public void setTrain_date(String train_date) {
		this.train_date = train_date;
	}
	public String getStation_train_code() {
		return station_train_code;
	}
	public void setStation_train_code(String station_train_code) {
		this.station_train_code = station_train_code;
	}
	public String getStation_telecode() {
		return station_telecode;
	}
	public void setStation_telecode(String station_telecode) {
		this.station_telecode = station_telecode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Ticket_entrance [train_date=" + train_date
				+ ", station_train_code=" + station_train_code
				+ ", station_telecode=" + station_telecode + "]";
	}
	

}
