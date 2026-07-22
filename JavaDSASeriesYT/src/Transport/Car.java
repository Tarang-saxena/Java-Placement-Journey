package Transport;

import java.util.SplittableRandom;

public class Car extends Vehicle {
        public int nodoors;
        public String transmission;

        Car(String name, String modle, int not, int nodoors, String transmission){
            super(name,modle,not);
            this.nodoors =nodoors;
            this.transmission = transmission;
            super.startEngine();
            super.stopEngine();
        }
        public void startAC(){
            System.out.println("AC start");
        }
}
