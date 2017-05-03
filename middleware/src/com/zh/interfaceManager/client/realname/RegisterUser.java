
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="born_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="check_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="check_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="check_status_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encourage_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="first_letter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IVR_passwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="if_receive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="if_receive_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_login_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password_new" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pwd_answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pwd_question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="register_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revSm_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "registerUser", propOrder = {
    "address",
    "bornDate",
    "checkCode",
    "checkStatus",
    "checkStatusName",
    "country",
    "countryName",
    "ctext",
    "email",
    "encourageFlag",
    "firstLetter",
    "flag",
    "ivrPasswd",
    "idNo",
    "idType",
    "idTypeName",
    "ifReceive",
    "ifReceiveName",
    "isActive",
    "lastLoginTime",
    "password",
    "passwordNew",
    "phone",
    "phoneFlag",
    "postalcode",
    "pwdAnswer",
    "pwdQuestion",
    "registerName",
    "revSmCode",
    "sexCode",
    "userId",
    "userName",
    "userSex",
    "userStatus",
    "userType",
    "zzkCcsj",
    "zzkCountryCode",
    "zzkCountryname",
    "zzkIdNo",
    "zzkIdType",
    "zzkIdTypeName",
    "zzkName"
})
public class RegisterUser  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String address;
    @XmlElement(name = "born_date")
    protected String bornDate;
    @XmlElement(name = "check_code")
    protected String checkCode;
    @XmlElement(name = "check_status")
    protected String checkStatus;
    @XmlElement(name = "check_status_name")
    protected String checkStatusName;
    protected String country;
    @XmlElement(name = "country_name")
    protected String countryName;
    protected String ctext;
    protected String email;
    @XmlElement(name = "encourage_flag")
    protected String encourageFlag;
    @XmlElement(name = "first_letter")
    protected String firstLetter;
    protected String flag;
    @XmlElement(name = "IVR_passwd")
    protected String ivrPasswd;
    @XmlElement(name = "id_no")
    protected String idNo;
    @XmlElement(name = "id_type")
    protected String idType;
    @XmlElement(name = "id_type_name")
    protected String idTypeName;
    @XmlElement(name = "if_receive")
    protected String ifReceive;
    @XmlElement(name = "if_receive_name")
    protected String ifReceiveName;
    @XmlElement(name = "is_active")
    protected String isActive;
    @XmlElement(name = "last_login_time")
    protected String lastLoginTime;
    protected String password;
    @XmlElement(name = "password_new")
    protected String passwordNew;
    protected String phone;
    @XmlElement(name = "phone_flag")
    protected String phoneFlag;
    protected String postalcode;
    @XmlElement(name = "pwd_answer")
    protected String pwdAnswer;
    @XmlElement(name = "pwd_question")
    protected String pwdQuestion;
    @XmlElement(name = "register_name")
    protected String registerName;
    @XmlElement(name = "revSm_code")
    protected String revSmCode;
    @XmlElement(name = "sex_code")
    protected String sexCode;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "user_name")
    protected String userName;
    @XmlElement(name = "user_sex")
    protected String userSex;
    @XmlElement(name = "user_status")
    protected String userStatus;
    @XmlElement(name = "user_type")
    protected String userType;
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

    @Override
	public String toString() {
		return "RegisterUser [address=" + address + ", bornDate=" + bornDate
				+ ", checkCode=" + checkCode + ", checkStatus=" + checkStatus
				+ ", checkStatusName=" + checkStatusName + ", country="
				+ country + ", countryName=" + countryName + ", ctext=" + ctext
				+ ", email=" + email + ", encourageFlag=" + encourageFlag
				+ ", firstLetter=" + firstLetter + ", flag=" + flag
				+ ", ivrPasswd=" + ivrPasswd + ", idNo=" + idNo + ", idType="
				+ idType + ", idTypeName=" + idTypeName + ", ifReceive="
				+ ifReceive + ", ifReceiveName=" + ifReceiveName
				+ ", isActive=" + isActive + ", lastLoginTime=" + lastLoginTime
				+ ", password=" + password + ", passwordNew=" + passwordNew
				+ ", phone=" + phone + ", phoneFlag=" + phoneFlag
				+ ", postalcode=" + postalcode + ", pwdAnswer=" + pwdAnswer
				+ ", pwdQuestion=" + pwdQuestion + ", registerName="
				+ registerName + ", revSmCode=" + revSmCode + ", sexCode="
				+ sexCode + ", userId=" + userId + ", userName=" + userName
				+ ", userSex=" + userSex + ", userStatus=" + userStatus
				+ ", userType=" + userType + ", zzkCcsj=" + zzkCcsj
				+ ", zzkCountryCode=" + zzkCountryCode + ", zzkCountryname="
				+ zzkCountryname + ", zzkIdNo=" + zzkIdNo + ", zzkIdType="
				+ zzkIdType + ", zzkIdTypeName=" + zzkIdTypeName + ", zzkName="
				+ zzkName + "]";
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
     * Gets the value of the checkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * Sets the value of the checkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckCode(String value) {
        this.checkCode = value;
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
     * Gets the value of the encourageFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncourageFlag() {
        return encourageFlag;
    }

    /**
     * Sets the value of the encourageFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncourageFlag(String value) {
        this.encourageFlag = value;
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
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * Gets the value of the ivrPasswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVRPasswd() {
        return ivrPasswd;
    }

    /**
     * Sets the value of the ivrPasswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVRPasswd(String value) {
        this.ivrPasswd = value;
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
     * Gets the value of the ifReceive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfReceive() {
        return ifReceive;
    }

    /**
     * Sets the value of the ifReceive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfReceive(String value) {
        this.ifReceive = value;
    }

    /**
     * Gets the value of the ifReceiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfReceiveName() {
        return ifReceiveName;
    }

    /**
     * Sets the value of the ifReceiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfReceiveName(String value) {
        this.ifReceiveName = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the lastLoginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginTime(String value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the passwordNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordNew() {
        return passwordNew;
    }

    /**
     * Sets the value of the passwordNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordNew(String value) {
        this.passwordNew = value;
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
     * Gets the value of the phoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneFlag() {
        return phoneFlag;
    }

    /**
     * Sets the value of the phoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneFlag(String value) {
        this.phoneFlag = value;
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
     * Gets the value of the pwdAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwdAnswer() {
        return pwdAnswer;
    }

    /**
     * Sets the value of the pwdAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwdAnswer(String value) {
        this.pwdAnswer = value;
    }

    /**
     * Gets the value of the pwdQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwdQuestion() {
        return pwdQuestion;
    }

    /**
     * Sets the value of the pwdQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwdQuestion(String value) {
        this.pwdQuestion = value;
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
     * Gets the value of the revSmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevSmCode() {
        return revSmCode;
    }

    /**
     * Sets the value of the revSmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevSmCode(String value) {
        this.revSmCode = value;
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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
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
     * Gets the value of the userSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * Sets the value of the userSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSex(String value) {
        this.userSex = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStatus(String value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
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
