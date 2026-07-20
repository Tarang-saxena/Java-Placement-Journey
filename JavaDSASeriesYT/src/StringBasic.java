import java.sql.SQLOutput;
import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s2 = sc.nextLine();
        System.out.println(s2);
        String str = "Tarang";
        String name = new String("Saxena");
        System.out.println(str +" "+name);
        System.out.println(str.length());
        System.out.println(str.charAt(0));

        // String is immutable
        String s = "h";
        s = "Happy";
        System.out.println(s);
        String s1 ="happy";
        if(s .equalsIgnoreCase(s1)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
