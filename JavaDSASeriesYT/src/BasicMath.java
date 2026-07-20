import java.util.Scanner;

public class BasicMath {

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
    }
}
