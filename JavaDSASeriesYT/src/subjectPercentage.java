import java.util.Scanner;

public class subjectPercentage {
    public static void main(String[] args) {
        System.out.print("enter your 5 subjecr's marks: ");
        Scanner sc = new Scanner(System.in);
        float Math = sc.nextFloat();
        float Science = sc.nextFloat();
        float english = sc.nextFloat();
        float hindi = sc.nextFloat();
        float GS = sc.nextFloat();
        float total =  Math + Science+ english + hindi + GS;
        float per = total/5;
        System.out.println("your percentage is: "+per);
        if(per >= 85){
            System.out.println("Good Job");
        } else if (per >=70 && per <= 84) {
            System.out.println("Good");
        }
        else{
            System.out.println("Work hard");
        }
    }
}
