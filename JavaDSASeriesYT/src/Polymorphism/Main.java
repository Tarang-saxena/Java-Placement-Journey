package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(4,6));
        System.out.println(obj.add(6,4,6));

        // Runtime polymorphism

        circle c = new circle();
        c.draw();
        dodraw(c);
        Rect r = new Rect();
        r.draw();
    }
    public static void dodraw(Shape s){
        s.draw();
    }
}
