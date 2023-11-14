package ferry;

public class port {
    private String name;
    private int id;
    
    public port(String Name, int Size){
        setName(Name);
        setID(Size);
    }
  
    public void setName(String Name){
        name = Name;
    }
    
    public void setID(int size){
        id = 200200 + size;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}