import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = sc.nextInt();
        while(i <= 10){
            System.out.print(+i +" ");
            i++;
        }
    }
}
