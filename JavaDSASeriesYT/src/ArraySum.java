public class ArraySum {
    public static void main(String[] args) {
        int arr[] = {34 , 68,24};
        int sum = 0 , ans =1;
        for(int i =0 ; i< arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum: "+sum);
        for(int i =0 ; i< arr.length ; i++){
            ans = ans  * arr[i];
        }
        System.out.println("Ans: "+ans);
    }
}
