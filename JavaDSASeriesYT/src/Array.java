import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[]  = new int[n];
        int brr[] = {4,6,3};
        System.out.print("enter values in array: ");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int v : arr){
            System.out.print(v+" ");
        }
       // System.out.println("Value at 0th index: "+brr[0]);
//        for(int i = 0; i< brr.length;i++){
//            System.out.print(brr[i]);
//        }
//     **   for each loop
//        for(int val : brr){
//            System.out.println(val);
//        }
    }
}
