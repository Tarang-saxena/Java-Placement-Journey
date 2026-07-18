import java.util.Scanner;

public class PercentageOf4sub {
    public static void main(String[] args) {
        System.out.print("enter your 5 subjecr's marks: ");
        Scanner sc = new Scanner(System.in);
        float m = sc.nextFloat();
        float s = sc.nextFloat();
        float e = sc.nextFloat();
        float h = sc.nextFloat();
        float g = sc.nextFloat();
        float min = m;
        if(s < min)
            min= s;
        if(e < min)
            min= e;
        if(h < min)
            min= h;
        if(g < min)
            min= g;
        float sum = m + s + e + h + g - min;
        float per = sum/4;
        System.out.println("your percentage is: "+per+"%");
        System.out.println("Minimum marks is: "+min);
    }
}
