import java.util.Scanner;

public class RightTriAB {
    public static void main(String[] args) {
        System.out.print("Enter the row: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
// char use her for a A  B C.. for next row
        for(int i =1;i <=n ;i++){
            char ch ='A';
            for(int j = 1; j<=i; j++){
//                int a = j;
//                int b = ('A' - 1);
//                int ans = a +b;
//                char finalans = (char)ans;
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
