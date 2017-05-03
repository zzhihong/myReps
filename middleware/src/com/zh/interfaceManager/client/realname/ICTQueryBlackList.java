
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_QueryBlackList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_QueryBlackList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonHeader" type="{http://ManageUserInfoWebServiceWS}commonHeader" minOccurs="0"/>
 *         &lt;element name="id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_no_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_QueryBlackList", propOrder = {
    "commonHeader",
    "idType",
    "idNumber",
    "idNoName"
})
public class ICTQueryBlackList  implements Serializable{

    protected CommonHeader commonHeader;
    @XmlElement(name = "id_type")
    protected String idType;
    @XmlElement(name = "id_number")
    protected String idNumber;
    @XmlElement(name = "id_no_name")
    protected String idNoName;

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
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the idNoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNoName() {
        return idNoName;
    }

    /**
     * Sets the value of the idNoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNoName(String value) {
        this.idNoName = value;
    }

}
