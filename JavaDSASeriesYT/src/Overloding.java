public class Overloding {
    static int add(int a , int b){
        int sum = a+b;
        return sum;
    }
    static int add(int a , int b , int c){
        int sum = a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        int s = add(5,9);
        int s1 = add(5,7,4);
        System.out.println("Sum: "+s);
        System.out.println("Sum: "+s1);
    }
}
