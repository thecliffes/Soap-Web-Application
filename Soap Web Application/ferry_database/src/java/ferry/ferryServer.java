package ferry;

import java.util.HashSet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.jws.WebService;


@WebService
public class ferryServer {
    private HashSet<port> ports = new HashSet<port>();
    private HashSet<ferryService> ferryServices = new HashSet<ferryService>(); 
    ReadWriteLock lock = new ReentrantReadWriteLock();
    private int portCount=0;
    private int ferryCount=0;
    
    public boolean addPort(String name){
        lock.writeLock().lock();
        try{
            portCount++;
            port p = new port(name, portCount);
            ports.add(p);
            return true;
        } finally{
            lock.writeLock().unlock();
        }
    }
    
    public boolean checkService(int pID, int fID){
        lock.readLock().lock();
        ferryService fs=null;
        port p=null;
        try{
            for(port pt : ports){
                if(pt.getID() == pID){
                    p = pt;
                }
            }
            for(ferryService fa : ferryServices){
                if(fa.getID() == fID){
                    fs = fa;
                }
            }
            if(fs == null || p == null){
                return false;
            }
            for(port pa : fs.getTable()){
                if(pa == p){
                    return true;
                }
            }
            return false;
        } finally {
            lock.readLock().unlock();
        }
    }
    
    public boolean addFerryService(String name, int time){
        lock.writeLock().lock();
        HashSet<port> ports = new HashSet<port>();
        try{
            ferryCount++;
            ferryService fs = new ferryService(ports, time, name,ferryCount);
            ferryServices.add(fs);
            return true;
        } finally {
            lock.writeLock().unlock();
        }
    }
    
    public boolean removeFerryService(int id){
        lock.writeLock().lock();
        try{
            for(ferryService fs : ferryServices){
                if(fs.getID()  == id){
                    ferryServices.remove(fs);
                }
            }
            return true;
        } finally {
            lock.writeLock().unlock();
        }
    }
    
    public String getFerryInfo(String name){
        lock.readLock().lock();
        try {
            for(ferryService fs : ferryServices){
                if(fs.getName().equals(name)){
                    return "The company name is " + fs.getName() + " the travel time is " + fs.getTime() + " the id is " + fs.getID();
                }
            }
            return "Invalid ID";
        } finally {
            lock.readLock().unlock();
        }
    }
    
    public String getFerryService(){
        lock.readLock().lock();
        String returnstate = "";
        try{
            if(ferryServices.isEmpty()){
                return "no ferry services have been added";
            }
            for(ferryService fs : ferryServices){
                returnstate =  returnstate + "id: " + fs.getID() + " time: " + fs.getTime() + " name: " + fs.getName()+ "\n";
            }
            return returnstate;
        } finally {
            lock.readLock().unlock();
        }
    }
    
    public String getPorts(){
        lock.readLock().lock();
        String returnstate = "";
        try{
            if(ports.isEmpty()){
                return "no ports have been added";
            }
            for(port pt : ports){
                returnstate =  returnstate + "id: " + pt.getID() +  " name: " + pt.getName()+ "\n";
            }
            return returnstate;
        } finally {
            lock.readLock().unlock();
        }
    }
}
