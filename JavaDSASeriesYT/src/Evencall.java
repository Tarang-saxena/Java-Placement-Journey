import java.util.Scanner;

public class Evencall {

    static boolean iseven(int a){

            return a %2 == 0 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = sc.nextInt();
        if(iseven(a)){
            System.out.println("even number");
        }
        else {
            System.out.println("Odd number");
        }

    }
}
