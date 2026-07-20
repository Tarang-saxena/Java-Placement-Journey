public class Display {
    static void display(int x){
        System.out.println("Num: "+x);
    }
    static void display(String str){
        System.out.println("String : "+str);
    }
    public static void main(String[] args) {
        display(10);
        display("Hello");
    }
}
