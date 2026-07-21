import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n){
        for(int i =2; i*i <= n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int j =2; j<=n; j++){
            if(isPrime(j)){
                System.out.println(j);
            }
        }
    }
}
