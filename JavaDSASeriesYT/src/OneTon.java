import java.util.Scanner;

public class OneTon {
    public static void main(String[] args) {
        System.out.print("Enter the n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ;i<=n; i++){
            System.out.print(i+" ");
        }
    }
}
