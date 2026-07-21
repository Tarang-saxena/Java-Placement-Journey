import java.util.Scanner;

public class BasicMath {

    static int GetLCM(int a , int b){
        int gcd = GetGCD(a,b);
        int lcm = (a*b)/gcd;
        return lcm;
    }
    static int GetGCD(int a , int b){
        // gcd(a,b) = gcd(b , a%b)
        while(b != 0){
            int oldb = b;
            b = a%b;
            a = oldb;
        }
        int ans =a ;
        return ans;
    }
    static boolean Primr(int num){
        for(int i =2; i<=Math.sqrt(num); i++)         // i*i < num
        {
            if(num  % i == 0){
                return false;
            }
        }
        return true;
    }
    static boolean Palindrome(int num){
        int  temp = num;
        int rev = Reverse(num);
        if(temp == rev){
            System.out.println("Palindrome number. ");
            return true;
        }
        else{
            System.out.println("Not palindrome");
            return false;
        }

    }
    static int Reverse(int num){
        int rev =0;
        while (num!=0){
            int d = num%10;
            rev = rev*10 + d;
            num = num/10;
        }
        return rev;
    }
    static int digitsum(int num){
        int sum =0;
        while(num!= 0){
            int digit =num%10 ;
            sum+= digit;
            num = num/10;
        }
        return sum;
    }
    static void PrintDigit(int num){
        // if num == 0 then stop
    while(num!= 0){
        int digit = num%10;
        System.out.println(digit);
        num = num /10;
    }
    }

    static int  CountDigit(int num){
        // if num == 0 then stop
        int count =0;
        while(num!= 0){
            int digit = num%10;
            count++;
            num = num /10;
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        PrintDigit(num);
        System.out.println( "count is: " +CountDigit(num));
        System.out.println("Sum is: "+digitsum(num));
        System.out.println("Reverce number is: "+Reverse(num));
        Palindrome(num);
        if(Primr(num)){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime");
        }
       int ans= GetGCD(3,6);
        System.out.println("GCD is: "+ans);
        System.out.println("LCM is: "+GetLCM(6,7));
    }
}
