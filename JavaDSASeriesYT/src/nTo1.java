import java.util.Scanner;

public class nTo1 {
    public static void main(String[] args) {
        System.out.print("Enter the n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i >= 1; i--) {
            System.out.print(i +" ");
        }
    }
}
