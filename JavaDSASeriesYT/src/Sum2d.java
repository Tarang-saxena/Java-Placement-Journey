import java.util.Scanner;

public class Sum2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        for(int i =0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print("provide value for row: "+i+ "and column: "+j+" ");
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i =0; i< arr.length;i++){
            for(int j = 0; j< arr[i].length; j++){
                sum+=arr[i][j];
            }
        }
        System.out.print("sum:  "+sum);
    }
}
