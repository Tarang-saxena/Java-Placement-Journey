import java.util.Scanner;

public class TakingInput {
   static void main() {
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter first number: ");
      int first=  sc.nextInt();
       System.out.print("Enter Srcond number: ");
       int second = sc.nextInt();
       int ans = first + second;
       System.out.println("Sum is: "+ans);
    }
}
