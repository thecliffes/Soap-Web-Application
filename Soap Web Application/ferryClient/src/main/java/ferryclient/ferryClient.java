package ferryclient;

import ferry.FerryServer;
import ferry.FerryServerService;
import java.util.HashSet;
import javax.sound.sampled.Port;

public class ferryClient {
    public static void main(String[] args) {
        FerryServerService service = new FerryServerService();
        FerryServer port = service.getFerryServerPort();
        
        
        //add port
        System.out.println(port.getPorts()); //gets ports
        port.addPort("sam");
        port.addPort("sam2");
        port.addPort("sam3");
        System.out.println(port.getPorts());
        
        //add ferry service
        System.out.println(port.getFerryService());//gets ferry services
        
        port.addFerryService("ben", 10);
        port.addFerryService("ben2", 15);
        System.out.println(port.getFerryService());
        
        //remove ferry service
        port.removeFerryService(200201);
        System.out.println(port.getFerryService());
    }
}
