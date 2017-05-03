
package com.zh.interfaceManager.client.pym;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zh.interfaceManager.client.pym package. 
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
public class ObjectFactory implements Serializable{

    private final static QName _QueryStationNamesJsonByPym_QNAME = new QName("http://dict.railway.com/", "queryStationNamesJsonByPym");
    private final static QName _QueryBureauCodeByStationName_QNAME = new QName("http://dict.railway.com/", "queryBureauCodeByStationName");
    private final static QName _QueryStationNamesByPymResponse_QNAME = new QName("http://dict.railway.com/", "queryStationNamesByPymResponse");
    private final static QName _QueryStationNamesJsonByPymResponse_QNAME = new QName("http://dict.railway.com/", "queryStationNamesJsonByPymResponse");
    private final static QName _QueryStationNamesByPym_QNAME = new QName("http://dict.railway.com/", "queryStationNamesByPym");
    private final static QName _QueryBureauCodeByStationNameResponse_QNAME = new QName("http://dict.railway.com/", "queryBureauCodeByStationNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zh.interfaceManager.client.pym
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryBureauCodeByStationName }
     * 
     */
    public QueryBureauCodeByStationName createQueryBureauCodeByStationName() {
        return new QueryBureauCodeByStationName();
    }

    /**
     * Create an instance of {@link QueryBureauCodeByStationNameResponse }
     * 
     */
    public QueryBureauCodeByStationNameResponse createQueryBureauCodeByStationNameResponse() {
        return new QueryBureauCodeByStationNameResponse();
    }

    /**
     * Create an instance of {@link QueryStationNamesByPym }
     * 
     */
    public QueryStationNamesByPym createQueryStationNamesByPym() {
        return new QueryStationNamesByPym();
    }

    /**
     * Create an instance of {@link QueryStationNamesJsonByPymResponse }
     * 
     */
    public QueryStationNamesJsonByPymResponse createQueryStationNamesJsonByPymResponse() {
        return new QueryStationNamesJsonByPymResponse();
    }

    /**
     * Create an instance of {@link QueryStationNamesByPymResponse }
     * 
     */
    public QueryStationNamesByPymResponse createQueryStationNamesByPymResponse() {
        return new QueryStationNamesByPymResponse();
    }

    /**
     * Create an instance of {@link QueryStationNamesJsonByPym }
     * 
     */
    public QueryStationNamesJsonByPym createQueryStationNamesJsonByPym() {
        return new QueryStationNamesJsonByPym();
    }

    /**
     * Create an instance of {@link ErrorInfo }
     * 
     */
    public ErrorInfo createErrorInfo() {
        return new ErrorInfo();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link StationNamesRS }
     * 
     */
    public StationNamesRS createStationNamesRS() {
        return new StationNamesRS();
    }

    /**
     * Create an instance of {@link ServiceHeader }
     * 
     */
    public ServiceHeader createServiceHeader() {
        return new ServiceHeader();
    }

    /**
     * Create an instance of {@link RsInfo }
     * 
     */
    public RsInfo createRsInfo() {
        return new RsInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStationNamesJsonByPym }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dict.railway.com/", name = "queryStationNamesJsonByPym")
    public JAXBElement<QueryStationNamesJsonByPym> createQueryStationNamesJsonByPym(QueryStationNamesJsonByPym value) {
        return new JAXBElement<QueryStationNamesJsonByPym>(_QueryStationNamesJsonByPym_QNAME, QueryStationNamesJsonByPym.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBureauCodeByStationName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dict.railway.com/", name = "queryBureauCodeByStationName")
    public JAXBElement<QueryBureauCodeByStationName> createQueryBureauCodeByStationName(QueryBureauCodeByStationName value) {
        return new JAXBElement<QueryBureauCodeByStationName>(_QueryBureauCodeByStationName_QNAME, QueryBureauCodeByStationName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStationNamesByPymResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dict.railway.com/", name = "queryStationNamesByPymResponse")
    public JAXBElement<QueryStationNamesByPymResponse> createQueryStationNamesByPymResponse(QueryStationNamesByPymResponse value) {
        return new JAXBElement<QueryStationNamesByPymResponse>(_QueryStationNamesByPymResponse_QNAME, QueryStationNamesByPymResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStationNamesJsonByPymResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dict.railway.com/", name = "queryStationNamesJsonByPymResponse")
    public JAXBElement<QueryStationNamesJsonByPymResponse> createQueryStationNamesJsonByPymResponse(QueryStationNamesJsonByPymResponse value) {
        return new JAXBElement<QueryStationNamesJsonByPymResponse>(_QueryStationNamesJsonByPymResponse_QNAME, QueryStationNamesJsonByPymResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStationNamesByPym }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dict.railway.com/", name = "queryStationNamesByPym")
    public JAXBElement<QueryStationNamesByPym> createQueryStationNamesByPym(QueryStationNamesByPym value) {
        return new JAXBElement<QueryStationNamesByPym>(_QueryStationNamesByPym_QNAME, QueryStationNamesByPym.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBureauCodeByStationNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dict.railway.com/", name = "queryBureauCodeByStationNameResponse")
    public JAXBElement<QueryBureauCodeByStationNameResponse> createQueryBureauCodeByStationNameResponse(QueryBureauCodeByStationNameResponse value) {
        return new JAXBElement<QueryBureauCodeByStationNameResponse>(_QueryBureauCodeByStationNameResponse_QNAME, QueryBureauCodeByStationNameResponse.class, null, value);
    }

}
