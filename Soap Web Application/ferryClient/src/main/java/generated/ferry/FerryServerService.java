package ferry;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-03-14T01:07:15.414Z
 * Generated source version: 3.5.0
 *
 */
@WebServiceClient(name = "ferryServerService",
                  wsdlLocation = "http://localhost:8080/ferry_database/ferryServerService?wsdl",
                  targetNamespace = "http://ferry/")
public class FerryServerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ferry/", "ferryServerService");
    public final static QName FerryServerPort = new QName("http://ferry/", "ferryServerPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ferry_database/ferryServerService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FerryServerService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ferry_database/ferryServerService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FerryServerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FerryServerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FerryServerService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public FerryServerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public FerryServerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public FerryServerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns FerryServer
     */
    @WebEndpoint(name = "ferryServerPort")
    public FerryServer getFerryServerPort() {
        return super.getPort(FerryServerPort, FerryServer.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FerryServer
     */
    @WebEndpoint(name = "ferryServerPort")
    public FerryServer getFerryServerPort(WebServiceFeature... features) {
        return super.getPort(FerryServerPort, FerryServer.class, features);
    }

}
