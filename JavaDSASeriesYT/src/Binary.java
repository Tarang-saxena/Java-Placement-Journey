public class Binary {
    public static void main(String[] args) {
        int arr[] = {4, 6, 11, 15, 17, 19};
        int key = 17;
        int str = 0, end = arr.length-1;
        while(str <= end){
            int mid = (str +end)/2;
            if(arr[mid] == key){
                System.out.println("found at index: "+mid);
                break;
            } else if (key > arr[mid]) {
                str = mid +1;
            }
            else{
                end = mid-1;
            }
        }
    }
}
