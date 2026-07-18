import java.util.Scanner;

public class HTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
//            part1
            for(int j =1; j<=i ;j++){
                System.out.print("* ");
            }
            // part2
            for(int j= 1; j <=2*(n-i);j++){
                System.out.print("  ");
            }

            //part3
            for(int j =1; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //inverted
        for(int i =1; i<=n;i++){
            //part4
            for(int j =1; j<=( n-i+1); j++){
                System.out.print("* ");
            }
            //part5
            for(int j = 1; j<=2*(i-1);j++){
                System.out.print("  ");
            }
            //part6
            for(int j =1; j<=( n-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
