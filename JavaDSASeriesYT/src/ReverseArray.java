public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {5,3,6,4,7};
        int str =0 , end = arr.length -1;
        while(str < end){
           // without temp use arithmatic  + - -(In LHS str end str) (IN RHS str end)
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end ] = temp;
            str++;
            end--;
        }
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}
