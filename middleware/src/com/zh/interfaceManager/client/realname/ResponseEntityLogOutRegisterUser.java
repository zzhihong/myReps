
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseEntityLogOutRegisterUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseEntityLogOutRegisterUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://ManageUserInfoWebServiceWS}exceptionEntity" minOccurs="0"/>
 *         &lt;element name="logoutuserDto" type="{http://ManageUserInfoWebServiceWS}logOutUserDTO" minOccurs="0"/>
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
@XmlType(name = "responseEntityLogOutRegisterUser", propOrder = {
    "header",
    "logoutuserDto",
    "tranData"
})
public class ResponseEntityLogOutRegisterUser  implements Serializable{

    protected ExceptionEntity header;
    protected LogOutUserDTO logoutuserDto;
    protected String tranData;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionEntity }
     *     
     */
    public ExceptionEntity getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionEntity }
     *     
     */
    public void setHeader(ExceptionEntity value) {
        this.header = value;
    }

    /**
     * Gets the value of the logoutuserDto property.
     * 
     * @return
     *     possible object is
     *     {@link LogOutUserDTO }
     *     
     */
    public LogOutUserDTO getLogoutuserDto() {
        return logoutuserDto;
    }

    /**
     * Sets the value of the logoutuserDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogOutUserDTO }
     *     
     */
    public void setLogoutuserDto(LogOutUserDTO value) {
        this.logoutuserDto = value;
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
