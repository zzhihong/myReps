
package com.zh.interfaceManager.client.jpk;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wb10TrainPlatform complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wb10TrainPlatform">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from_coach_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platform_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platform_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platform_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="station_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="station_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="station_telecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="station_train_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stop_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stop_rule" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stop_style" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="to_coach_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="train_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wb10TrainPlatform", propOrder = {
    "fromCoachNo",
    "origin",
    "platformNo",
    "platformType",
    "platformTypeName",
    "startDate",
    "stationName",
    "stationNo",
    "stationTelecode",
    "stationTrainCode",
    "stopDate",
    "stopRule",
    "stopStyle",
    "toCoachNo",
    "trainNo"
})
public class Wb10TrainPlatform implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "from_coach_no")
    protected String fromCoachNo;
    protected String origin;
    @XmlElement(name = "platform_no")
    protected String platformNo;
    @XmlElement(name = "platform_type")
    protected String platformType;
    @XmlElement(name = "platform_type_name")
    protected String platformTypeName;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "station_name")
    protected String stationName;
    @XmlElement(name = "station_no")
    protected String stationNo;
    @XmlElement(name = "station_telecode")
    protected String stationTelecode;
    @XmlElement(name = "station_train_code")
    protected String stationTrainCode;
    @XmlElement(name = "stop_date")
    protected String stopDate;
    @XmlElement(name = "stop_rule")
    protected int stopRule;
    @XmlElement(name = "stop_style")
    protected int stopStyle;
    @XmlElement(name = "to_coach_no")
    protected String toCoachNo;
    @XmlElement(name = "train_no")
    protected String trainNo;

    /**
     * Gets the value of the fromCoachNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCoachNo() {
        return fromCoachNo;
    }

    /**
     * Sets the value of the fromCoachNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCoachNo(String value) {
        this.fromCoachNo = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the platformNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformNo() {
        return platformNo;
    }

    /**
     * Sets the value of the platformNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformNo(String value) {
        this.platformNo = value;
    }

    /**
     * Gets the value of the platformType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformType() {
        return platformType;
    }

    /**
     * Sets the value of the platformType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformType(String value) {
        this.platformType = value;
    }

    /**
     * Gets the value of the platformTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformTypeName() {
        return platformTypeName;
    }

    /**
     * Sets the value of the platformTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformTypeName(String value) {
        this.platformTypeName = value;
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
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the stationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationNo() {
        return stationNo;
    }

    /**
     * Sets the value of the stationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationNo(String value) {
        this.stationNo = value;
    }

    /**
     * Gets the value of the stationTelecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTelecode() {
        return stationTelecode;
    }

    /**
     * Sets the value of the stationTelecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTelecode(String value) {
        this.stationTelecode = value;
    }

    /**
     * Gets the value of the stationTrainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTrainCode() {
        return stationTrainCode;
    }

    /**
     * Sets the value of the stationTrainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTrainCode(String value) {
        this.stationTrainCode = value;
    }

    /**
     * Gets the value of the stopDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopDate() {
        return stopDate;
    }

    /**
     * Sets the value of the stopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopDate(String value) {
        this.stopDate = value;
    }

    /**
     * Gets the value of the stopRule property.
     * 
     */
    public int getStopRule() {
        return stopRule;
    }

    /**
     * Sets the value of the stopRule property.
     * 
     */
    public void setStopRule(int value) {
        this.stopRule = value;
    }

    /**
     * Gets the value of the stopStyle property.
     * 
     */
    public int getStopStyle() {
        return stopStyle;
    }

    /**
     * Sets the value of the stopStyle property.
     * 
     */
    public void setStopStyle(int value) {
        this.stopStyle = value;
    }

    /**
     * Gets the value of the toCoachNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCoachNo() {
        return toCoachNo;
    }

    /**
     * Sets the value of the toCoachNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCoachNo(String value) {
        this.toCoachNo = value;
    }

    /**
     * Gets the value of the trainNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNo() {
        return trainNo;
    }

    /**
     * Sets the value of the trainNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNo(String value) {
        this.trainNo = value;
    }

	@Override
	public String toString() {
		return "Wb10TrainPlatform [fromCoachNo=" + fromCoachNo + ", origin="
				+ origin + ", platformNo=" + platformNo + ", platformType="
				+ platformType + ", platformTypeName=" + platformTypeName
				+ ", startDate=" + startDate + ", stationName=" + stationName
				+ ", stationNo=" + stationNo + ", stationTelecode="
				+ stationTelecode + ", stationTrainCode=" + stationTrainCode
				+ ", stopDate=" + stopDate + ", stopRule=" + stopRule
				+ ", stopStyle=" + stopStyle + ", toCoachNo=" + toCoachNo
				+ ", trainNo=" + trainNo + "]";
	}

}
