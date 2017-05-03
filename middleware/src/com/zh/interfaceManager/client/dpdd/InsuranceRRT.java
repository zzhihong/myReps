
package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insuranceRRT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insuranceRRT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batch_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="board_train_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="children_effect_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="children_insure_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coach_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="day_night" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end_station_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end_station_telecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from_station_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from_tele_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insure_price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insure_single_price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insure_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_status_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_status_record" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_trade_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoice_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="node_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="office_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operater_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_id_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_mobile_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="print_office_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="print_operater_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="print_station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="print_statistics_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="print_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="print_window_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="product_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regain_office_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regain_operater_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regain_station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regain_statistics_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regain_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regain_window_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reserve_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserver_id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserver_id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserver_id_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserver_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resign_batch_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resign_coach_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resign_seat_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resign_ticket_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="return_insure_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="return_insure_station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="return_insure_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="return_insure_window" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="return_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reurn_trade_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sale_insure_station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sale_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sale_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seat_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seat_type_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seat_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequence_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_station_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_station_telecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statistics_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticket_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticket_state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticket_state_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticket_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="to_station_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to_tele_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="train_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="train_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmit_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmit_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="update_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="update_time_record" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="window_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceRRT", propOrder = {
    "agencyCode",
    "batchNo",
    "boardTrainCode",
    "childrenEffectFlag",
    "childrenInsureNo",
    "cityCode",
    "cityName",
    "coachNo",
    "companyCode",
    "dayNight",
    "dbName",
    "email",
    "endDate",
    "endStationName",
    "endStationTelecode",
    "endTime",
    "flag1",
    "flag2",
    "flag3",
    "flag4",
    "flag5",
    "flag6",
    "fromStationName",
    "fromTeleCode",
    "insureCode",
    "insureMode",
    "insureNo",
    "insureNum",
    "insurePrice",
    "insureSinglePrice",
    "insureStatus",
    "insureStatusName",
    "insureStatusRecord",
    "insureTradeNo",
    "insureType",
    "insureTypeName",
    "invoiceStatus",
    "loginName",
    "mobileNo",
    "nodeCode",
    "officeNo",
    "operaterNo",
    "passengerIdNo",
    "passengerIdType",
    "passengerIdTypeName",
    "passengerMobileNo",
    "passengerName",
    "printOfficeNo",
    "printOperaterNo",
    "printStation",
    "printStatisticsDate",
    "printTime",
    "printWindowNo",
    "productCode",
    "provinceCode",
    "provinceName",
    "regainOfficeNo",
    "regainOperaterNo",
    "regainStation",
    "regainStatisticsDate",
    "regainTime",
    "regainWindowNo",
    "reserveTime",
    "reserverIdNo",
    "reserverIdType",
    "reserverIdTypeName",
    "reserverName",
    "resignBatchNo",
    "resignCoachNo",
    "resignSeatNo",
    "resignTicketNo",
    "returnInsureNo",
    "returnInsureStation",
    "returnInsureTime",
    "returnInsureWindow",
    "returnMode",
    "reurnTradeNo",
    "saleInsureStation",
    "saleMode",
    "saleTime",
    "seatNo",
    "seatTypeCode",
    "seatTypeName",
    "sequenceNo",
    "startDate",
    "startStationName",
    "startStationTelecode",
    "startTime",
    "statisticsDate",
    "ticketNo",
    "ticketState",
    "ticketStateName",
    "ticketType",
    "toStationName",
    "toTeleCode",
    "trainCode",
    "trainDate",
    "transmitFlag",
    "transmitId",
    "updateTime",
    "updateTimeRecord",
    "windowNo"
})
public class InsuranceRRT implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "agency_code")
    protected String agencyCode;
    @XmlElement(name = "batch_no")
    protected int batchNo;
    @XmlElement(name = "board_train_code")
    protected String boardTrainCode;
    @XmlElement(name = "children_effect_flag")
    protected String childrenEffectFlag;
    @Override
	public String toString() {
		return "InsuranceRRT [agencyCode=" + agencyCode + ", batchNo="
				+ batchNo + ", boardTrainCode=" + boardTrainCode
				+ ", childrenEffectFlag=" + childrenEffectFlag
				+ ", childrenInsureNo=" + childrenInsureNo + ", cityCode="
				+ cityCode + ", cityName=" + cityName + ", coachNo=" + coachNo
				+ ", companyCode=" + companyCode + ", dayNight=" + dayNight
				+ ", dbName=" + dbName + ", email=" + email + ", endDate="
				+ endDate + ", endStationName=" + endStationName
				+ ", endStationTelecode=" + endStationTelecode + ", endTime="
				+ endTime + ", flag1=" + flag1 + ", flag2=" + flag2
				+ ", flag3=" + flag3 + ", flag4=" + flag4 + ", flag5=" + flag5
				+ ", flag6=" + flag6 + ", fromStationName=" + fromStationName
				+ ", fromTeleCode=" + fromTeleCode + ", insureCode="
				+ insureCode + ", insureMode=" + insureMode + ", insureNo="
				+ insureNo + ", insureNum=" + insureNum + ", insurePrice="
				+ insurePrice + ", insureSinglePrice=" + insureSinglePrice
				+ ", insureStatus=" + insureStatus + ", insureStatusName="
				+ insureStatusName + ", insureStatusRecord="
				+ insureStatusRecord + ", insureTradeNo=" + insureTradeNo
				+ ", insureType=" + insureType + ", insureTypeName="
				+ insureTypeName + ", invoiceStatus=" + invoiceStatus
				+ ", loginName=" + loginName + ", mobileNo=" + mobileNo
				+ ", nodeCode=" + nodeCode + ", officeNo=" + officeNo
				+ ", operaterNo=" + operaterNo + ", passengerIdNo="
				+ passengerIdNo + ", passengerIdType=" + passengerIdType
				+ ", passengerIdTypeName=" + passengerIdTypeName
				+ ", passengerMobileNo=" + passengerMobileNo
				+ ", passengerName=" + passengerName + ", printOfficeNo="
				+ printOfficeNo + ", printOperaterNo=" + printOperaterNo
				+ ", printStation=" + printStation + ", printStatisticsDate="
				+ printStatisticsDate + ", printTime=" + printTime
				+ ", printWindowNo=" + printWindowNo + ", productCode="
				+ productCode + ", provinceCode=" + provinceCode
				+ ", provinceName=" + provinceName + ", regainOfficeNo="
				+ regainOfficeNo + ", regainOperaterNo=" + regainOperaterNo
				+ ", regainStation=" + regainStation
				+ ", regainStatisticsDate=" + regainStatisticsDate
				+ ", regainTime=" + regainTime + ", regainWindowNo="
				+ regainWindowNo + ", reserveTime=" + reserveTime
				+ ", reserverIdNo=" + reserverIdNo + ", reserverIdType="
				+ reserverIdType + ", reserverIdTypeName=" + reserverIdTypeName
				+ ", reserverName=" + reserverName + ", resignBatchNo="
				+ resignBatchNo + ", resignCoachNo=" + resignCoachNo
				+ ", resignSeatNo=" + resignSeatNo + ", resignTicketNo="
				+ resignTicketNo + ", returnInsureNo=" + returnInsureNo
				+ ", returnInsureStation=" + returnInsureStation
				+ ", returnInsureTime=" + returnInsureTime
				+ ", returnInsureWindow=" + returnInsureWindow
				+ ", returnMode=" + returnMode + ", reurnTradeNo="
				+ reurnTradeNo + ", saleInsureStation=" + saleInsureStation
				+ ", saleMode=" + saleMode + ", saleTime=" + saleTime
				+ ", seatNo=" + seatNo + ", seatTypeCode=" + seatTypeCode
				+ ", seatTypeName=" + seatTypeName + ", sequenceNo="
				+ sequenceNo + ", startDate=" + startDate
				+ ", startStationName=" + startStationName
				+ ", startStationTelecode=" + startStationTelecode
				+ ", startTime=" + startTime + ", statisticsDate="
				+ statisticsDate + ", ticketNo=" + ticketNo + ", ticketState="
				+ ticketState + ", ticketStateName=" + ticketStateName
				+ ", ticketType=" + ticketType + ", toStationName="
				+ toStationName + ", toTeleCode=" + toTeleCode + ", trainCode="
				+ trainCode + ", trainDate=" + trainDate + ", transmitFlag="
				+ transmitFlag + ", transmitId=" + transmitId + ", updateTime="
				+ updateTime + ", updateTimeRecord=" + updateTimeRecord
				+ ", windowNo=" + windowNo + "]";
	}

	@XmlElement(name = "children_insure_no")
    protected String childrenInsureNo;
    @XmlElement(name = "city_code")
    protected String cityCode;
    @XmlElement(name = "city_name")
    protected String cityName;
    @XmlElement(name = "coach_no")
    protected String coachNo;
    @XmlElement(name = "company_code")
    protected String companyCode;
    @XmlElement(name = "day_night")
    protected String dayNight;
    @XmlElement(name = "db_name")
    protected String dbName;
    protected String email;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "end_station_name")
    protected String endStationName;
    @XmlElement(name = "end_station_telecode")
    protected String endStationTelecode;
    @XmlElement(name = "end_time")
    protected String endTime;
    protected String flag1;
    protected String flag2;
    protected String flag3;
    protected String flag4;
    protected String flag5;
    protected String flag6;
    @XmlElement(name = "from_station_name")
    protected String fromStationName;
    @XmlElement(name = "from_tele_code")
    protected String fromTeleCode;
    @XmlElement(name = "insure_code")
    protected String insureCode;
    @XmlElement(name = "insure_mode")
    protected String insureMode;
    @XmlElement(name = "insure_no")
    protected String insureNo;
    @XmlElement(name = "insure_num")
    protected int insureNum;
    @XmlElement(name = "insure_price")
    protected int insurePrice;
    @XmlElement(name = "insure_single_price")
    protected int insureSinglePrice;
    @XmlElement(name = "insure_status")
    protected String insureStatus;
    @XmlElement(name = "insure_status_name")
    protected String insureStatusName;
    @XmlElement(name = "insure_status_record")
    protected String insureStatusRecord;
    @XmlElement(name = "insure_trade_no")
    protected String insureTradeNo;
    @XmlElement(name = "insure_type")
    protected String insureType;
    @XmlElement(name = "insure_type_name")
    protected String insureTypeName;
    @XmlElement(name = "invoice_status")
    protected String invoiceStatus;
    @XmlElement(name = "login_name")
    protected String loginName;
    @XmlElement(name = "mobile_no")
    protected String mobileNo;
    @XmlElement(name = "node_code")
    protected String nodeCode;
    @XmlElement(name = "office_no")
    protected String officeNo;
    @XmlElement(name = "operater_no")
    protected String operaterNo;
    @XmlElement(name = "passenger_id_no")
    protected String passengerIdNo;
    @XmlElement(name = "passenger_id_type")
    protected String passengerIdType;
    @XmlElement(name = "passenger_id_type_name")
    protected String passengerIdTypeName;
    @XmlElement(name = "passenger_mobile_no")
    protected String passengerMobileNo;
    @XmlElement(name = "passenger_name")
    protected String passengerName;
    @XmlElement(name = "print_office_no")
    protected String printOfficeNo;
    @XmlElement(name = "print_operater_no")
    protected String printOperaterNo;
    @XmlElement(name = "print_station")
    protected String printStation;
    @XmlElement(name = "print_statistics_date")
    protected String printStatisticsDate;
    @XmlElement(name = "print_time")
    protected String printTime;
    @XmlElement(name = "print_window_no")
    protected int printWindowNo;
    @XmlElement(name = "product_code")
    protected String productCode;
    @XmlElement(name = "province_code")
    protected String provinceCode;
    @XmlElement(name = "province_name")
    protected String provinceName;
    @XmlElement(name = "regain_office_no")
    protected String regainOfficeNo;
    @XmlElement(name = "regain_operater_no")
    protected String regainOperaterNo;
    @XmlElement(name = "regain_station")
    protected String regainStation;
    @XmlElement(name = "regain_statistics_date")
    protected String regainStatisticsDate;
    @XmlElement(name = "regain_time")
    protected String regainTime;
    @XmlElement(name = "regain_window_no")
    protected int regainWindowNo;
    @XmlElement(name = "reserve_time")
    protected String reserveTime;
    @XmlElement(name = "reserver_id_no")
    protected String reserverIdNo;
    @XmlElement(name = "reserver_id_type")
    protected String reserverIdType;
    @XmlElement(name = "reserver_id_type_name")
    protected String reserverIdTypeName;
    @XmlElement(name = "reserver_name")
    protected String reserverName;
    @XmlElement(name = "resign_batch_no")
    protected int resignBatchNo;
    @XmlElement(name = "resign_coach_no")
    protected String resignCoachNo;
    @XmlElement(name = "resign_seat_no")
    protected String resignSeatNo;
    @XmlElement(name = "resign_ticket_no")
    protected String resignTicketNo;
    @XmlElement(name = "return_insure_no")
    protected String returnInsureNo;
    @XmlElement(name = "return_insure_station")
    protected String returnInsureStation;
    @XmlElement(name = "return_insure_time")
    protected String returnInsureTime;
    @XmlElement(name = "return_insure_window")
    protected int returnInsureWindow;
    @XmlElement(name = "return_mode")
    protected String returnMode;
    @XmlElement(name = "reurn_trade_no")
    protected String reurnTradeNo;
    @XmlElement(name = "sale_insure_station")
    protected String saleInsureStation;
    @XmlElement(name = "sale_mode")
    protected String saleMode;
    @XmlElement(name = "sale_time")
    protected String saleTime;
    @XmlElement(name = "seat_no")
    protected String seatNo;
    @XmlElement(name = "seat_type_code")
    protected String seatTypeCode;
    @XmlElement(name = "seat_type_name")
    protected String seatTypeName;
    @XmlElement(name = "sequence_no")
    protected String sequenceNo;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "start_station_name")
    protected String startStationName;
    @XmlElement(name = "start_station_telecode")
    protected String startStationTelecode;
    @XmlElement(name = "start_time")
    protected String startTime;
    @XmlElement(name = "statistics_date")
    protected String statisticsDate;
    @XmlElement(name = "ticket_no")
    protected String ticketNo;
    @XmlElement(name = "ticket_state")
    protected String ticketState;
    @XmlElement(name = "ticket_state_name")
    protected String ticketStateName;
    @XmlElement(name = "ticket_type")
    protected int ticketType;
    @XmlElement(name = "to_station_name")
    protected String toStationName;
    @XmlElement(name = "to_tele_code")
    protected String toTeleCode;
    @XmlElement(name = "train_code")
    protected String trainCode;
    @XmlElement(name = "train_date")
    protected String trainDate;
    @XmlElement(name = "transmit_flag")
    protected String transmitFlag;
    @XmlElement(name = "transmit_id")
    protected String transmitId;
    @XmlElement(name = "update_time")
    protected String updateTime;
    @XmlElement(name = "update_time_record")
    protected String updateTimeRecord;
    @XmlElement(name = "window_no")
    protected int windowNo;

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the batchNo property.
     * 
     */
    public int getBatchNo() {
        return batchNo;
    }

    /**
     * Sets the value of the batchNo property.
     * 
     */
    public void setBatchNo(int value) {
        this.batchNo = value;
    }

    /**
     * Gets the value of the boardTrainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardTrainCode() {
        return boardTrainCode;
    }

    /**
     * Sets the value of the boardTrainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardTrainCode(String value) {
        this.boardTrainCode = value;
    }

    /**
     * Gets the value of the childrenEffectFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildrenEffectFlag() {
        return childrenEffectFlag;
    }

    /**
     * Sets the value of the childrenEffectFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildrenEffectFlag(String value) {
        this.childrenEffectFlag = value;
    }

    /**
     * Gets the value of the childrenInsureNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildrenInsureNo() {
        return childrenInsureNo;
    }

    /**
     * Sets the value of the childrenInsureNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildrenInsureNo(String value) {
        this.childrenInsureNo = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the coachNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoachNo() {
        return coachNo;
    }

    /**
     * Sets the value of the coachNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoachNo(String value) {
        this.coachNo = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the dayNight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayNight() {
        return dayNight;
    }

    /**
     * Sets the value of the dayNight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayNight(String value) {
        this.dayNight = value;
    }

    /**
     * Gets the value of the dbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * Sets the value of the dbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbName(String value) {
        this.dbName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndStationName() {
        return endStationName;
    }

    /**
     * Sets the value of the endStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndStationName(String value) {
        this.endStationName = value;
    }

    /**
     * Gets the value of the endStationTelecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndStationTelecode() {
        return endStationTelecode;
    }

    /**
     * Sets the value of the endStationTelecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndStationTelecode(String value) {
        this.endStationTelecode = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the flag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag1() {
        return flag1;
    }

    /**
     * Sets the value of the flag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag1(String value) {
        this.flag1 = value;
    }

    /**
     * Gets the value of the flag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag2() {
        return flag2;
    }

    /**
     * Sets the value of the flag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag2(String value) {
        this.flag2 = value;
    }

    /**
     * Gets the value of the flag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag3() {
        return flag3;
    }

    /**
     * Sets the value of the flag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag3(String value) {
        this.flag3 = value;
    }

    /**
     * Gets the value of the flag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag4() {
        return flag4;
    }

    /**
     * Sets the value of the flag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag4(String value) {
        this.flag4 = value;
    }

    /**
     * Gets the value of the flag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag5() {
        return flag5;
    }

    /**
     * Sets the value of the flag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag5(String value) {
        this.flag5 = value;
    }

    /**
     * Gets the value of the flag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag6() {
        return flag6;
    }

    /**
     * Sets the value of the flag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag6(String value) {
        this.flag6 = value;
    }

    /**
     * Gets the value of the fromStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromStationName() {
        return fromStationName;
    }

    /**
     * Sets the value of the fromStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromStationName(String value) {
        this.fromStationName = value;
    }

    /**
     * Gets the value of the fromTeleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTeleCode() {
        return fromTeleCode;
    }

    /**
     * Sets the value of the fromTeleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTeleCode(String value) {
        this.fromTeleCode = value;
    }

    /**
     * Gets the value of the insureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureCode() {
        return insureCode;
    }

    /**
     * Sets the value of the insureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureCode(String value) {
        this.insureCode = value;
    }

    /**
     * Gets the value of the insureMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureMode() {
        return insureMode;
    }

    /**
     * Sets the value of the insureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureMode(String value) {
        this.insureMode = value;
    }

    /**
     * Gets the value of the insureNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureNo() {
        return insureNo;
    }

    /**
     * Sets the value of the insureNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureNo(String value) {
        this.insureNo = value;
    }

    /**
     * Gets the value of the insureNum property.
     * 
     */
    public int getInsureNum() {
        return insureNum;
    }

    /**
     * Sets the value of the insureNum property.
     * 
     */
    public void setInsureNum(int value) {
        this.insureNum = value;
    }

    /**
     * Gets the value of the insurePrice property.
     * 
     */
    public int getInsurePrice() {
        return insurePrice;
    }

    /**
     * Sets the value of the insurePrice property.
     * 
     */
    public void setInsurePrice(int value) {
        this.insurePrice = value;
    }

    /**
     * Gets the value of the insureSinglePrice property.
     * 
     */
    public int getInsureSinglePrice() {
        return insureSinglePrice;
    }

    /**
     * Sets the value of the insureSinglePrice property.
     * 
     */
    public void setInsureSinglePrice(int value) {
        this.insureSinglePrice = value;
    }

    /**
     * Gets the value of the insureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureStatus() {
        return insureStatus;
    }

    /**
     * Sets the value of the insureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureStatus(String value) {
        this.insureStatus = value;
    }

    /**
     * Gets the value of the insureStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureStatusName() {
        return insureStatusName;
    }

    /**
     * Sets the value of the insureStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureStatusName(String value) {
        this.insureStatusName = value;
    }

    /**
     * Gets the value of the insureStatusRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureStatusRecord() {
        return insureStatusRecord;
    }

    /**
     * Sets the value of the insureStatusRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureStatusRecord(String value) {
        this.insureStatusRecord = value;
    }

    /**
     * Gets the value of the insureTradeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureTradeNo() {
        return insureTradeNo;
    }

    /**
     * Sets the value of the insureTradeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureTradeNo(String value) {
        this.insureTradeNo = value;
    }

    /**
     * Gets the value of the insureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureType() {
        return insureType;
    }

    /**
     * Sets the value of the insureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureType(String value) {
        this.insureType = value;
    }

    /**
     * Gets the value of the insureTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureTypeName() {
        return insureTypeName;
    }

    /**
     * Sets the value of the insureTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureTypeName(String value) {
        this.insureTypeName = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceStatus(String value) {
        this.invoiceStatus = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the nodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeCode() {
        return nodeCode;
    }

    /**
     * Sets the value of the nodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeCode(String value) {
        this.nodeCode = value;
    }

    /**
     * Gets the value of the officeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeNo() {
        return officeNo;
    }

    /**
     * Sets the value of the officeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeNo(String value) {
        this.officeNo = value;
    }

    /**
     * Gets the value of the operaterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperaterNo() {
        return operaterNo;
    }

    /**
     * Sets the value of the operaterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperaterNo(String value) {
        this.operaterNo = value;
    }

    /**
     * Gets the value of the passengerIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerIdNo() {
        return passengerIdNo;
    }

    /**
     * Sets the value of the passengerIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerIdNo(String value) {
        this.passengerIdNo = value;
    }

    /**
     * Gets the value of the passengerIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerIdType() {
        return passengerIdType;
    }

    /**
     * Sets the value of the passengerIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerIdType(String value) {
        this.passengerIdType = value;
    }

    /**
     * Gets the value of the passengerIdTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerIdTypeName() {
        return passengerIdTypeName;
    }

    /**
     * Sets the value of the passengerIdTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerIdTypeName(String value) {
        this.passengerIdTypeName = value;
    }

    /**
     * Gets the value of the passengerMobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerMobileNo() {
        return passengerMobileNo;
    }

    /**
     * Sets the value of the passengerMobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerMobileNo(String value) {
        this.passengerMobileNo = value;
    }

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the printOfficeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOfficeNo() {
        return printOfficeNo;
    }

    /**
     * Sets the value of the printOfficeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOfficeNo(String value) {
        this.printOfficeNo = value;
    }

    /**
     * Gets the value of the printOperaterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOperaterNo() {
        return printOperaterNo;
    }

    /**
     * Sets the value of the printOperaterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOperaterNo(String value) {
        this.printOperaterNo = value;
    }

    /**
     * Gets the value of the printStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintStation() {
        return printStation;
    }

    /**
     * Sets the value of the printStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintStation(String value) {
        this.printStation = value;
    }

    /**
     * Gets the value of the printStatisticsDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintStatisticsDate() {
        return printStatisticsDate;
    }

    /**
     * Sets the value of the printStatisticsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintStatisticsDate(String value) {
        this.printStatisticsDate = value;
    }

    /**
     * Gets the value of the printTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintTime() {
        return printTime;
    }

    /**
     * Sets the value of the printTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintTime(String value) {
        this.printTime = value;
    }

    /**
     * Gets the value of the printWindowNo property.
     * 
     */
    public int getPrintWindowNo() {
        return printWindowNo;
    }

    /**
     * Sets the value of the printWindowNo property.
     * 
     */
    public void setPrintWindowNo(int value) {
        this.printWindowNo = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the provinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets the value of the provinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceCode(String value) {
        this.provinceCode = value;
    }

    /**
     * Gets the value of the provinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the value of the provinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceName(String value) {
        this.provinceName = value;
    }

    /**
     * Gets the value of the regainOfficeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegainOfficeNo() {
        return regainOfficeNo;
    }

    /**
     * Sets the value of the regainOfficeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegainOfficeNo(String value) {
        this.regainOfficeNo = value;
    }

    /**
     * Gets the value of the regainOperaterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegainOperaterNo() {
        return regainOperaterNo;
    }

    /**
     * Sets the value of the regainOperaterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegainOperaterNo(String value) {
        this.regainOperaterNo = value;
    }

    /**
     * Gets the value of the regainStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegainStation() {
        return regainStation;
    }

    /**
     * Sets the value of the regainStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegainStation(String value) {
        this.regainStation = value;
    }

    /**
     * Gets the value of the regainStatisticsDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegainStatisticsDate() {
        return regainStatisticsDate;
    }

    /**
     * Sets the value of the regainStatisticsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegainStatisticsDate(String value) {
        this.regainStatisticsDate = value;
    }

    /**
     * Gets the value of the regainTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegainTime() {
        return regainTime;
    }

    /**
     * Sets the value of the regainTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegainTime(String value) {
        this.regainTime = value;
    }

    /**
     * Gets the value of the regainWindowNo property.
     * 
     */
    public int getRegainWindowNo() {
        return regainWindowNo;
    }

    /**
     * Sets the value of the regainWindowNo property.
     * 
     */
    public void setRegainWindowNo(int value) {
        this.regainWindowNo = value;
    }

    /**
     * Gets the value of the reserveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveTime() {
        return reserveTime;
    }

    /**
     * Sets the value of the reserveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveTime(String value) {
        this.reserveTime = value;
    }

    /**
     * Gets the value of the reserverIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserverIdNo() {
        return reserverIdNo;
    }

    /**
     * Sets the value of the reserverIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserverIdNo(String value) {
        this.reserverIdNo = value;
    }

    /**
     * Gets the value of the reserverIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserverIdType() {
        return reserverIdType;
    }

    /**
     * Sets the value of the reserverIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserverIdType(String value) {
        this.reserverIdType = value;
    }

    /**
     * Gets the value of the reserverIdTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserverIdTypeName() {
        return reserverIdTypeName;
    }

    /**
     * Sets the value of the reserverIdTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserverIdTypeName(String value) {
        this.reserverIdTypeName = value;
    }

    /**
     * Gets the value of the reserverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserverName() {
        return reserverName;
    }

    /**
     * Sets the value of the reserverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserverName(String value) {
        this.reserverName = value;
    }

    /**
     * Gets the value of the resignBatchNo property.
     * 
     */
    public int getResignBatchNo() {
        return resignBatchNo;
    }

    /**
     * Sets the value of the resignBatchNo property.
     * 
     */
    public void setResignBatchNo(int value) {
        this.resignBatchNo = value;
    }

    /**
     * Gets the value of the resignCoachNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResignCoachNo() {
        return resignCoachNo;
    }

    /**
     * Sets the value of the resignCoachNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResignCoachNo(String value) {
        this.resignCoachNo = value;
    }

    /**
     * Gets the value of the resignSeatNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResignSeatNo() {
        return resignSeatNo;
    }

    /**
     * Sets the value of the resignSeatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResignSeatNo(String value) {
        this.resignSeatNo = value;
    }

    /**
     * Gets the value of the resignTicketNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResignTicketNo() {
        return resignTicketNo;
    }

    /**
     * Sets the value of the resignTicketNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResignTicketNo(String value) {
        this.resignTicketNo = value;
    }

    /**
     * Gets the value of the returnInsureNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnInsureNo() {
        return returnInsureNo;
    }

    /**
     * Sets the value of the returnInsureNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnInsureNo(String value) {
        this.returnInsureNo = value;
    }

    /**
     * Gets the value of the returnInsureStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnInsureStation() {
        return returnInsureStation;
    }

    /**
     * Sets the value of the returnInsureStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnInsureStation(String value) {
        this.returnInsureStation = value;
    }

    /**
     * Gets the value of the returnInsureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnInsureTime() {
        return returnInsureTime;
    }

    /**
     * Sets the value of the returnInsureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnInsureTime(String value) {
        this.returnInsureTime = value;
    }

    /**
     * Gets the value of the returnInsureWindow property.
     * 
     */
    public int getReturnInsureWindow() {
        return returnInsureWindow;
    }

    /**
     * Sets the value of the returnInsureWindow property.
     * 
     */
    public void setReturnInsureWindow(int value) {
        this.returnInsureWindow = value;
    }

    /**
     * Gets the value of the returnMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMode() {
        return returnMode;
    }

    /**
     * Sets the value of the returnMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMode(String value) {
        this.returnMode = value;
    }

    /**
     * Gets the value of the reurnTradeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReurnTradeNo() {
        return reurnTradeNo;
    }

    /**
     * Sets the value of the reurnTradeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReurnTradeNo(String value) {
        this.reurnTradeNo = value;
    }

    /**
     * Gets the value of the saleInsureStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleInsureStation() {
        return saleInsureStation;
    }

    /**
     * Sets the value of the saleInsureStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleInsureStation(String value) {
        this.saleInsureStation = value;
    }

    /**
     * Gets the value of the saleMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleMode() {
        return saleMode;
    }

    /**
     * Sets the value of the saleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleMode(String value) {
        this.saleMode = value;
    }

    /**
     * Gets the value of the saleTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTime() {
        return saleTime;
    }

    /**
     * Sets the value of the saleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTime(String value) {
        this.saleTime = value;
    }

    /**
     * Gets the value of the seatNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNo() {
        return seatNo;
    }

    /**
     * Sets the value of the seatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNo(String value) {
        this.seatNo = value;
    }

    /**
     * Gets the value of the seatTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatTypeCode() {
        return seatTypeCode;
    }

    /**
     * Sets the value of the seatTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatTypeCode(String value) {
        this.seatTypeCode = value;
    }

    /**
     * Gets the value of the seatTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatTypeName() {
        return seatTypeName;
    }

    /**
     * Sets the value of the seatTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatTypeName(String value) {
        this.seatTypeName = value;
    }

    /**
     * Gets the value of the sequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNo() {
        return sequenceNo;
    }

    /**
     * Sets the value of the sequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNo(String value) {
        this.sequenceNo = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartStationName() {
        return startStationName;
    }

    /**
     * Sets the value of the startStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartStationName(String value) {
        this.startStationName = value;
    }

    /**
     * Gets the value of the startStationTelecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartStationTelecode() {
        return startStationTelecode;
    }

    /**
     * Sets the value of the startStationTelecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartStationTelecode(String value) {
        this.startStationTelecode = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the statisticsDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsDate() {
        return statisticsDate;
    }

    /**
     * Sets the value of the statisticsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsDate(String value) {
        this.statisticsDate = value;
    }

    /**
     * Gets the value of the ticketNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNo() {
        return ticketNo;
    }

    /**
     * Sets the value of the ticketNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNo(String value) {
        this.ticketNo = value;
    }

    /**
     * Gets the value of the ticketState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketState() {
        return ticketState;
    }

    /**
     * Sets the value of the ticketState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketState(String value) {
        this.ticketState = value;
    }

    /**
     * Gets the value of the ticketStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStateName() {
        return ticketStateName;
    }

    /**
     * Sets the value of the ticketStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketStateName(String value) {
        this.ticketStateName = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     */
    public int getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     */
    public void setTicketType(int value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the toStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToStationName() {
        return toStationName;
    }

    /**
     * Sets the value of the toStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToStationName(String value) {
        this.toStationName = value;
    }

    /**
     * Gets the value of the toTeleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTeleCode() {
        return toTeleCode;
    }

    /**
     * Sets the value of the toTeleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTeleCode(String value) {
        this.toTeleCode = value;
    }

    /**
     * Gets the value of the trainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainCode() {
        return trainCode;
    }

    /**
     * Sets the value of the trainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainCode(String value) {
        this.trainCode = value;
    }

    /**
     * Gets the value of the trainDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainDate() {
        return trainDate;
    }

    /**
     * Sets the value of the trainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainDate(String value) {
        this.trainDate = value;
    }

    /**
     * Gets the value of the transmitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmitFlag() {
        return transmitFlag;
    }

    /**
     * Sets the value of the transmitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmitFlag(String value) {
        this.transmitFlag = value;
    }

    /**
     * Gets the value of the transmitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmitId() {
        return transmitId;
    }

    /**
     * Sets the value of the transmitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmitId(String value) {
        this.transmitId = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the updateTimeRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTimeRecord() {
        return updateTimeRecord;
    }

    /**
     * Sets the value of the updateTimeRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTimeRecord(String value) {
        this.updateTimeRecord = value;
    }

    /**
     * Gets the value of the windowNo property.
     * 
     */
    public int getWindowNo() {
        return windowNo;
    }

    /**
     * Sets the value of the windowNo property.
     * 
     */
    public void setWindowNo(int value) {
        this.windowNo = value;
    }

}
