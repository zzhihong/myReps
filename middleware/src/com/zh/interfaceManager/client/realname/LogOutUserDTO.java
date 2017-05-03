
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logOutUserDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="logOutUserDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logOutUserInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="log_off" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="register_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logOutUserDTO", propOrder = {
    "logOutUserInfo",
    "logOff",
    "registerName"
})
public class LogOutUserDTO  implements Serializable{

    protected String logOutUserInfo;
    @XmlElement(name = "log_off")
    protected String logOff;
    @XmlElement(name = "register_name")
    protected String registerName;

    /**
     * Gets the value of the logOutUserInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogOutUserInfo() {
        return logOutUserInfo;
    }

    /**
     * Sets the value of the logOutUserInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogOutUserInfo(String value) {
        this.logOutUserInfo = value;
    }

    /**
     * Gets the value of the logOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogOff() {
        return logOff;
    }

    /**
     * Sets the value of the logOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogOff(String value) {
        this.logOff = value;
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

}
