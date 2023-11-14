package ferry;

import java.util.HashSet;;

public class ferryService {
    private int id; //generate unique id
    private HashSet<port> ports = new HashSet<port>();
    private int time;
    private String name;
    
    public ferryService(HashSet<port> Ports, int Time, String Name, int Size){
        setTable(Ports);
        setName(Name);
        setTime(Time);
        setID(Size);
    }
    
    public void setName(String Name){
        name = Name;
    }
    
    public void setTime(int Time){
        time = Time;
    }
    
    public void setID(int size){
        id = 200200 + size;
    }
    
    public void setTable(HashSet<port> Ports){
        ports = Ports;
    }
    
    public int getID(){
        return id;
    }
    
    public HashSet<port> getTable(){
        return ports;
    }
    
    public String getName(){
        return name;
    }
    
    public int getTime(){
        return time;
    }
}
