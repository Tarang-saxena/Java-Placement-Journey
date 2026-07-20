public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= {4, 6,3,7, 9,2,5};
        int target =3;
        for(int i =0; i<arr.length;i++){
            if(arr[i] == target)
            {
                System.out.println("Found it at index: "+i);
                break;
            }
        }
    }
}
