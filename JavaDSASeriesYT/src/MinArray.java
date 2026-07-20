public class MinArray {
    public static void main(String[] args) {
        int arr[] = {84, 24 -4 , -7,83 ,1 ,3, 53, 23};
        int min = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Minimum value is : "+min);
    }
}
