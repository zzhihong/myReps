
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseEntityBlackList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseEntityBlackList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://ManageUserInfoWebServiceWS}exceptionEntity" minOccurs="0"/>
 *         &lt;element name="specialTicketList" type="{http://ManageUserInfoWebServiceWS}specialTicketLimit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseEntityBlackList", propOrder = {
    "header",
    "specialTicketList"
})
public class ResponseEntityBlackList  implements Serializable{

    protected ExceptionEntity header;
    @XmlElement(nillable = true)
    protected List<SpecialTicketLimit> specialTicketList;

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
     * Gets the value of the specialTicketList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialTicketList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialTicketList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialTicketLimit }
     * 
     * 
     */
    public List<SpecialTicketLimit> getSpecialTicketList() {
        if (specialTicketList == null) {
            specialTicketList = new ArrayList<SpecialTicketLimit>();
        }
        return this.specialTicketList;
    }

}
