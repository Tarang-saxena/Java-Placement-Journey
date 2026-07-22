package Transport;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("maruti", "800", 4, 4, "Auto");
       // c.startEngine();
       c.startAC();
//        c.stopEngine();
        MotorCycle m = new MotorCycle("Splender", "xline" , 2, "u", "soft");
        m.wheelie();
        m.startEngine();
        m.stopEngine();
    }
}
