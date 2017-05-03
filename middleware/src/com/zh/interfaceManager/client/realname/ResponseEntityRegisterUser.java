
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseEntityRegisterUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseEntityRegisterUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://ManageUserInfoWebServiceWS}exceptionEntity" minOccurs="0"/>
 *         &lt;element name="registerUserList" type="{http://ManageUserInfoWebServiceWS}registerUser" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "responseEntityRegisterUser", propOrder = {
    "header",
    "registerUserList",
    "tranData"
})
public class ResponseEntityRegisterUser  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ExceptionEntity header;
    @XmlElement(nillable = true)
    protected List<RegisterUser> registerUserList;
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

    @Override
	public String toString() {
		return "ResponseEntityRegisterUser [header=" + header
				+ ", registerUserList=" + registerUserList + ", tranData="
				+ tranData + "]";
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
     * Gets the value of the registerUserList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerUserList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterUserList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterUser }
     * 
     * 
     */
    public List<RegisterUser> getRegisterUserList() {
        if (registerUserList == null) {
            registerUserList = new ArrayList<RegisterUser>();
        }
        return this.registerUserList;
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
