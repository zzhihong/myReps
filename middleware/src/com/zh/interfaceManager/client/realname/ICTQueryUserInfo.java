
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_QueryUserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_QueryUserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonHeader" type="{http://ManageUserInfoWebServiceWS}commonHeader" minOccurs="0"/>
 *         &lt;element name="registerUser" type="{http://ManageUserInfoWebServiceWS}registerUser" minOccurs="0"/>
 *         &lt;element name="tranData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_QueryUserInfo", propOrder = {
    "commonHeader",
    "registerUser",
    "tranData"
})
public class ICTQueryUserInfo  implements Serializable{

    protected CommonHeader commonHeader;
    protected RegisterUser registerUser;
    protected String tranData;

    /**
     * Gets the value of the commonHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CommonHeader }
     *     
     */
    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    /**
     * Sets the value of the commonHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonHeader }
     *     
     */
    public void setCommonHeader(CommonHeader value) {
        this.commonHeader = value;
    }

    /**
     * Gets the value of the registerUser property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterUser }
     *     
     */
    public RegisterUser getRegisterUser() {
        return registerUser;
    }

    /**
     * Sets the value of the registerUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterUser }
     *     
     */
    public void setRegisterUser(RegisterUser value) {
        this.registerUser = value;
    }

    /**
     * Gets the value of the tranData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranData() {
        return tranData;
    }

    /**
     * Sets the value of the tranData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranData(String value) {
        this.tranData = value;
    }

}
