import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
//        String gender = "Male";
//        int age = 45;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender: ");
        String gender = sc.nextLine() ;
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(gender.equalsIgnoreCase("male")){
            System.out.println("You are male.");
            if(age >= 18){
                System.out.println("Eligible for vote.");
            }
            else{
                System.out.println("Not eligible for vote.");
            }
        }
        else{
            System.out.println("You are not male.");
        }
    }
}
