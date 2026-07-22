package Transport;

public class Vehicle {
    public String name ;
    public String modle;
    public int noty ;
    Vehicle(String name, String modle, int not){
        this.name = name;
        this.modle =modle;
        this.noty = not;
    }
   public Vehicle(){
        this.name = "";
        this.modle = "";
        this.noty =-1;
    }
    void startEngine(){
        System.out.println("Engine is starting "+name);
    }
    void stopEngine(){
        System.out.println("Stop engine "+modle);
    }
}
