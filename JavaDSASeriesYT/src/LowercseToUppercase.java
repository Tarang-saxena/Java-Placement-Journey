
import java.util.Scanner;
public class LowercseToUppercase {
    public static void main(String[] args) {
        System.out.print("Enter lowercase character: ");
        Scanner sc = new Scanner(System.in);
        char low = sc.next().charAt(0);
        System.out.print("Enter uppercase character: ");
        char up = sc.next().charAt(0);
        char upper = Character.toUpperCase(low);
        char lower = Character.toUpperCase(up);
        System.out.println("Uppercase character : "+upper);
        System.out.println("Lowercase character is: "+lower);
    }
}
