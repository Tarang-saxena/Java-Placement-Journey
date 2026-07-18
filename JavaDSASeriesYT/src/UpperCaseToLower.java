import java.util.Scanner;

public class UpperCaseToLower {
    public static void main(String[] args) {
        System.out.print("Enter a uppercase string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String lower = str.toLowerCase();
        System.out.println("Lowercase is: "+lower);
    }
}
