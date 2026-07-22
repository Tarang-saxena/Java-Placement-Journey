package Transport;

public class MotorCycle extends Vehicle {
    public  String handle;
    public String suspension;

    MotorCycle(String  name , String modle, int not, String handle, String suspention){
        super(name,modle, not);
        this.handle =handle;
        this.suspension= suspention;

    }
    public void wheelie(){
        System.out.println("wheelie: "+name );
    }
}
