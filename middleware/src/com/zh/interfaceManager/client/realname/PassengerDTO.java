
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passengerDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passengerDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="born_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="check_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="check_status_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="first_letter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insertPassengerDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isUserSelf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lasteDeleteDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="register_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zzk_ccsj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zzk_countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zzk_countryname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zzk_id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zzk_id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zzk_id_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zzk_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passengerDTO", propOrder = {
    "address",
    "bornDate",
    "checkStatus",
    "checkStatusName",
    "code",
    "country",
    "countryName",
    "ctext",
    "email",
    "firstLetter",
    "idNo",
    "idType",
    "idTypeName",
    "insertPassengerDate",
    "isUserSelf",
    "lasteDeleteDate",
    "mobileNo",
    "passengerFlag",
    "passengerType",
    "passengerTypeName",
    "phone",
    "postalcode",
    "recordCount",
    "registerName",
    "sexCode",
    "sexName",
    "userName",
    "zzkCcsj",
    "zzkCountryCode",
    "zzkCountryname",
    "zzkIdNo",
    "zzkIdType",
    "zzkIdTypeName",
    "zzkName"
})
public class PassengerDTO  implements Serializable{

    protected String address;
    @XmlElement(name = "born_date")
    protected String bornDate;
    @XmlElement(name = "check_status")
    protected String checkStatus;
    @XmlElement(name = "check_status_name")
    protected String checkStatusName;
    protected String code;
    protected String country;
    @XmlElement(name = "country_name")
    protected String countryName;
    protected String ctext;
    protected String email;
    @XmlElement(name = "first_letter")
    protected String firstLetter;
    @XmlElement(name = "id_no")
    protected String idNo;
    @XmlElement(name = "id_type")
    protected String idType;
    @XmlElement(name = "id_type_name")
    protected String idTypeName;
    protected String insertPassengerDate;
    protected String isUserSelf;
    protected String lasteDeleteDate;
    @XmlElement(name = "mobile_no")
    protected String mobileNo;
    @XmlElement(name = "passenger_flag")
    protected String passengerFlag;
    @XmlElement(name = "passenger_type")
    protected String passengerType;
    @XmlElement(name = "passenger_type_name")
    protected String passengerTypeName;
    protected String phone;
    protected String postalcode;
    protected String recordCount;
    @XmlElement(name = "register_name")
    protected String registerName;
    @XmlElement(name = "sex_code")
    protected String sexCode;
    @XmlElement(name = "sex_name")
    protected String sexName;
    @XmlElement(name = "user_name")
    protected String userName;
    @XmlElement(name = "zzk_ccsj")
    protected String zzkCcsj;
    @XmlElement(name = "zzk_countryCode")
    protected String zzkCountryCode;
    @XmlElement(name = "zzk_countryname")
    protected String zzkCountryname;
    @XmlElement(name = "zzk_id_no")
    protected String zzkIdNo;
    @XmlElement(name = "zzk_id_type")
    protected String zzkIdType;
    @XmlElement(name = "zzk_id_type_name")
    protected String zzkIdTypeName;
    @XmlElement(name = "zzk_name")
    protected String zzkName;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the bornDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBornDate() {
        return bornDate;
    }

    /**
     * Sets the value of the bornDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBornDate(String value) {
        this.bornDate = value;
    }

    /**
     * Gets the value of the checkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    /**
     * Sets the value of the checkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatus(String value) {
        this.checkStatus = value;
    }

    /**
     * Gets the value of the checkStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatusName() {
        return checkStatusName;
    }

    /**
     * Sets the value of the checkStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatusName(String value) {
        this.checkStatusName = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the ctext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtext() {
        return ctext;
    }

    /**
     * Sets the value of the ctext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtext(String value) {
        this.ctext = value;
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
     * Gets the value of the firstLetter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLetter() {
        return firstLetter;
    }

    /**
     * Sets the value of the firstLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLetter(String value) {
        this.firstLetter = value;
    }

    /**
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo(String value) {
        this.idNo = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTypeName() {
        return idTypeName;
    }

    /**
     * Sets the value of the idTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTypeName(String value) {
        this.idTypeName = value;
    }

    /**
     * Gets the value of the insertPassengerDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertPassengerDate() {
        return insertPassengerDate;
    }

    /**
     * Sets the value of the insertPassengerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertPassengerDate(String value) {
        this.insertPassengerDate = value;
    }

    /**
     * Gets the value of the isUserSelf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUserSelf() {
        return isUserSelf;
    }

    /**
     * Sets the value of the isUserSelf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUserSelf(String value) {
        this.isUserSelf = value;
    }

    /**
     * Gets the value of the lasteDeleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLasteDeleteDate() {
        return lasteDeleteDate;
    }

    /**
     * Sets the value of the lasteDeleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLasteDeleteDate(String value) {
        this.lasteDeleteDate = value;
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
     * Gets the value of the passengerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerFlag() {
        return passengerFlag;
    }

    /**
     * Sets the value of the passengerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerFlag(String value) {
        this.passengerFlag = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the passengerTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeName() {
        return passengerTypeName;
    }

    /**
     * Sets the value of the passengerTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeName(String value) {
        this.passengerTypeName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalcode(String value) {
        this.postalcode = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCount(String value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the registerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterName() {
        return registerName;
    }

    /**
     * Sets the value of the registerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterName(String value) {
        this.registerName = value;
    }

    /**
     * Gets the value of the sexCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * Sets the value of the sexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexCode(String value) {
        this.sexCode = value;
    }

    /**
     * Gets the value of the sexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexName() {
        return sexName;
    }

    /**
     * Sets the value of the sexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexName(String value) {
        this.sexName = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the zzkCcsj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzkCcsj() {
        return zzkCcsj;
    }

    /**
     * Sets the value of the zzkCcsj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzkCcsj(String value) {
        this.zzkCcsj = value;
    }

    /**
     * Gets the value of the zzkCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzkCountryCode() {
        return zzkCountryCode;
    }

    /**
     * Sets the value of the zzkCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzkCountryCode(String value) {
        this.zzkCountryCode = value;
    }

    /**
     * Gets the value of the zzkCountryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzkCountryname() {
        return zzkCountryname;
    }

    /**
     * Sets the value of the zzkCountryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzkCountryname(String value) {
        this.zzkCountryname = value;
    }

    /**
     * Gets the value of the zzkIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzkIdNo() {
        return zzkIdNo;
    }

    /**
     * Sets the value of the zzkIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzkIdNo(String value) {
        this.zzkIdNo = value;
    }

    /**
     * Gets the value of the zzkIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzkIdType() {
        return zzkIdType;
    }

    /**
     * Sets the value of the zzkIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzkIdType(String value) {
        this.zzkIdType = value;
    }

    /**
     * Gets the value of the zzkIdTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzkIdTypeName() {
        return zzkIdTypeName;
    }

    /**
     * Sets the value of the zzkIdTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzkIdTypeName(String value) {
        this.zzkIdTypeName = value;
    }

    /**
     * Gets the value of the zzkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzkName() {
        return zzkName;
    }

    /**
     * Sets the value of the zzkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzkName(String value) {
        this.zzkName = value;
    }

}
