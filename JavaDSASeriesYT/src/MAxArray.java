public class MAxArray {
    public static void main(String[] args) {
        int arr[] = {45, 89 ,-4 ,7, 245 , 9384 , 3 ,73, 7432};
        int max = arr[0];
        for(int i =0; i< arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("Maximum value: "+max);
    }
}
