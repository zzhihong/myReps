
package com.zh.interfaceManager.client.jpk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zh.interfaceManager.client.dpdd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryCheckTicketInfo_QNAME = new QName("http://TRSForCustomerSupportCenterServices2Service", "queryCheckTicketInfo");
    private final static QName _QueryCheckTicketInfoResponse_QNAME = new QName("http://TRSForCustomerSupportCenterServices2Service", "queryCheckTicketInfoResponse");
   
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zh.interfaceManager.client.dpdd
     * 
     */
    public ObjectFactory() {
    }

    

    /**
     * Create an instance of {@link QueryCheckTicketInfo }
     * 
     */
    public QueryCheckTicketInfo createQueryCheckTicketInfo() {
        return new QueryCheckTicketInfo();
    }

    
    /**
     * Create an instance of {@link QueryCheckTicketInfoResponse }
     * 
     */
    public QueryCheckTicketInfoResponse createQueryCheckTicketInfoResponse() {
        return new QueryCheckTicketInfoResponse();
    }

   

    /**
     * Create an instance of {@link ExceptionEntity }
     * 
     */
    public ExceptionEntity createExceptionEntity() {
        return new ExceptionEntity();
    }

    

    

   

    
    

    /**
     * Create an instance of {@link IctCheckTicketPlatForm }
     * 
     */
    public IctCheckTicketPlatForm createIctCheckTicketPlatForm() {
        return new IctCheckTicketPlatForm();
    }

    

    

    

    /**
     * Create an instance of {@link Wb10TrainPlatform }
     * 
     */
    public Wb10TrainPlatform createWb10TrainPlatform() {
        return new Wb10TrainPlatform();
    }

    

    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCheckTicketInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TRSForCustomerSupportCenterServices2Service", name = "queryCheckTicketInfo")
    public JAXBElement<QueryCheckTicketInfo> createQueryCheckTicketInfo(QueryCheckTicketInfo value) {
        return new JAXBElement<QueryCheckTicketInfo>(_QueryCheckTicketInfo_QNAME, QueryCheckTicketInfo.class, null, value);
    }

    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCheckTicketInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TRSForCustomerSupportCenterServices2Service", name = "queryCheckTicketInfoResponse")
    public JAXBElement<QueryCheckTicketInfoResponse> createQueryCheckTicketInfoResponse(QueryCheckTicketInfoResponse value) {
        return new JAXBElement<QueryCheckTicketInfoResponse>(_QueryCheckTicketInfoResponse_QNAME, QueryCheckTicketInfoResponse.class, null, value);
    }

    
    
}
