
package com.zh.interfaceManager.client.dpdd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ictCheckTicketPlatForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ictCheckTicketPlatForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://TRSForCustomerSupportCenterServices2Service}exceptionEntity" minOccurs="0"/>
 *         &lt;element name="trainPlatFormList" type="{http://TRSForCustomerSupportCenterServices2Service}wb10TrainPlatform" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ictCheckTicketPlatForm", propOrder = {
    "header",
    "trainPlatFormList"
})
public class IctCheckTicketPlatForm {

    protected ExceptionEntity header;
    @XmlElement(nillable = true)
    protected List<Wb10TrainPlatform> trainPlatFormList;

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
     * Gets the value of the trainPlatFormList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainPlatFormList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainPlatFormList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wb10TrainPlatform }
     * 
     * 
     */
    public List<Wb10TrainPlatform> getTrainPlatFormList() {
        if (trainPlatFormList == null) {
            trainPlatFormList = new ArrayList<Wb10TrainPlatform>();
        }
        return this.trainPlatFormList;
    }

}
