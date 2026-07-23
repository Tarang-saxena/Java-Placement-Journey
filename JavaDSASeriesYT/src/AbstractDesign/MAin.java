package AbstractDesign;

public class MAin {
    public static void main(String[] args) {
      //  Bird b = new Bird() ;        not allowed bcz abstract class has no object
        Bird b = new sparrow();
        //reference = object
        b.eat();
        b.fly();

    }
}
    abstract class Bird{
        abstract void fly();
        abstract void eat();
    }
  class sparrow extends Bird{
        void fly(){
            System.out.println("fly");
        }
        void eat(){
            System.out.println("eating");
        }
    }

    // Inteface

        interface birds{
        void flies();

        }
        class spar implements birds{
         public void flies(){
             System.out.println("sparrow fying");
         }
        }
