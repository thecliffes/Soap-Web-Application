
package ferry;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ferry package. 
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

    private final static QName _AddFerryService_QNAME = new QName("http://ferry/", "addFerryService");
    private final static QName _AddFerryServiceResponse_QNAME = new QName("http://ferry/", "addFerryServiceResponse");
    private final static QName _AddPort_QNAME = new QName("http://ferry/", "addPort");
    private final static QName _AddPortResponse_QNAME = new QName("http://ferry/", "addPortResponse");
    private final static QName _CheckService_QNAME = new QName("http://ferry/", "checkService");
    private final static QName _CheckServiceResponse_QNAME = new QName("http://ferry/", "checkServiceResponse");
    private final static QName _GetFerryInfo_QNAME = new QName("http://ferry/", "getFerryInfo");
    private final static QName _GetFerryInfoResponse_QNAME = new QName("http://ferry/", "getFerryInfoResponse");
    private final static QName _GetFerryService_QNAME = new QName("http://ferry/", "getFerryService");
    private final static QName _GetFerryServiceResponse_QNAME = new QName("http://ferry/", "getFerryServiceResponse");
    private final static QName _GetPorts_QNAME = new QName("http://ferry/", "getPorts");
    private final static QName _GetPortsResponse_QNAME = new QName("http://ferry/", "getPortsResponse");
    private final static QName _RemoveFerryService_QNAME = new QName("http://ferry/", "removeFerryService");
    private final static QName _RemoveFerryServiceResponse_QNAME = new QName("http://ferry/", "removeFerryServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ferry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddFerryService }
     * 
     */
    public AddFerryService createAddFerryService() {
        return new AddFerryService();
    }

    /**
     * Create an instance of {@link AddFerryServiceResponse }
     * 
     */
    public AddFerryServiceResponse createAddFerryServiceResponse() {
        return new AddFerryServiceResponse();
    }

    /**
     * Create an instance of {@link AddPort }
     * 
     */
    public AddPort createAddPort() {
        return new AddPort();
    }

    /**
     * Create an instance of {@link AddPortResponse }
     * 
     */
    public AddPortResponse createAddPortResponse() {
        return new AddPortResponse();
    }

    /**
     * Create an instance of {@link CheckService }
     * 
     */
    public CheckService createCheckService() {
        return new CheckService();
    }

    /**
     * Create an instance of {@link CheckServiceResponse }
     * 
     */
    public CheckServiceResponse createCheckServiceResponse() {
        return new CheckServiceResponse();
    }

    /**
     * Create an instance of {@link GetFerryInfo }
     * 
     */
    public GetFerryInfo createGetFerryInfo() {
        return new GetFerryInfo();
    }

    /**
     * Create an instance of {@link GetFerryInfoResponse }
     * 
     */
    public GetFerryInfoResponse createGetFerryInfoResponse() {
        return new GetFerryInfoResponse();
    }

    /**
     * Create an instance of {@link GetFerryService }
     * 
     */
    public GetFerryService createGetFerryService() {
        return new GetFerryService();
    }

    /**
     * Create an instance of {@link GetFerryServiceResponse }
     * 
     */
    public GetFerryServiceResponse createGetFerryServiceResponse() {
        return new GetFerryServiceResponse();
    }

    /**
     * Create an instance of {@link GetPorts }
     * 
     */
    public GetPorts createGetPorts() {
        return new GetPorts();
    }

    /**
     * Create an instance of {@link GetPortsResponse }
     * 
     */
    public GetPortsResponse createGetPortsResponse() {
        return new GetPortsResponse();
    }

    /**
     * Create an instance of {@link RemoveFerryService }
     * 
     */
    public RemoveFerryService createRemoveFerryService() {
        return new RemoveFerryService();
    }

    /**
     * Create an instance of {@link RemoveFerryServiceResponse }
     * 
     */
    public RemoveFerryServiceResponse createRemoveFerryServiceResponse() {
        return new RemoveFerryServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFerryService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFerryService }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "addFerryService")
    public JAXBElement<AddFerryService> createAddFerryService(AddFerryService value) {
        return new JAXBElement<AddFerryService>(_AddFerryService_QNAME, AddFerryService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFerryServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFerryServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "addFerryServiceResponse")
    public JAXBElement<AddFerryServiceResponse> createAddFerryServiceResponse(AddFerryServiceResponse value) {
        return new JAXBElement<AddFerryServiceResponse>(_AddFerryServiceResponse_QNAME, AddFerryServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPort }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "addPort")
    public JAXBElement<AddPort> createAddPort(AddPort value) {
        return new JAXBElement<AddPort>(_AddPort_QNAME, AddPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "addPortResponse")
    public JAXBElement<AddPortResponse> createAddPortResponse(AddPortResponse value) {
        return new JAXBElement<AddPortResponse>(_AddPortResponse_QNAME, AddPortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckService }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "checkService")
    public JAXBElement<CheckService> createCheckService(CheckService value) {
        return new JAXBElement<CheckService>(_CheckService_QNAME, CheckService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "checkServiceResponse")
    public JAXBElement<CheckServiceResponse> createCheckServiceResponse(CheckServiceResponse value) {
        return new JAXBElement<CheckServiceResponse>(_CheckServiceResponse_QNAME, CheckServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFerryInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFerryInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getFerryInfo")
    public JAXBElement<GetFerryInfo> createGetFerryInfo(GetFerryInfo value) {
        return new JAXBElement<GetFerryInfo>(_GetFerryInfo_QNAME, GetFerryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFerryInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFerryInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getFerryInfoResponse")
    public JAXBElement<GetFerryInfoResponse> createGetFerryInfoResponse(GetFerryInfoResponse value) {
        return new JAXBElement<GetFerryInfoResponse>(_GetFerryInfoResponse_QNAME, GetFerryInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFerryService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFerryService }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getFerryService")
    public JAXBElement<GetFerryService> createGetFerryService(GetFerryService value) {
        return new JAXBElement<GetFerryService>(_GetFerryService_QNAME, GetFerryService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFerryServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFerryServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getFerryServiceResponse")
    public JAXBElement<GetFerryServiceResponse> createGetFerryServiceResponse(GetFerryServiceResponse value) {
        return new JAXBElement<GetFerryServiceResponse>(_GetFerryServiceResponse_QNAME, GetFerryServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPorts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPorts }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getPorts")
    public JAXBElement<GetPorts> createGetPorts(GetPorts value) {
        return new JAXBElement<GetPorts>(_GetPorts_QNAME, GetPorts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPortsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getPortsResponse")
    public JAXBElement<GetPortsResponse> createGetPortsResponse(GetPortsResponse value) {
        return new JAXBElement<GetPortsResponse>(_GetPortsResponse_QNAME, GetPortsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFerryService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveFerryService }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "removeFerryService")
    public JAXBElement<RemoveFerryService> createRemoveFerryService(RemoveFerryService value) {
        return new JAXBElement<RemoveFerryService>(_RemoveFerryService_QNAME, RemoveFerryService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFerryServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveFerryServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "removeFerryServiceResponse")
    public JAXBElement<RemoveFerryServiceResponse> createRemoveFerryServiceResponse(RemoveFerryServiceResponse value) {
        return new JAXBElement<RemoveFerryServiceResponse>(_RemoveFerryServiceResponse_QNAME, RemoveFerryServiceResponse.class, null, value);
    }

}
