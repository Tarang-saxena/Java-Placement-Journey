public class EvenArray {
    public static void main(String[] args) {
        int arr[]= {4, 6,3,7, 9,2,5};
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
        System.out.println("Number of even is: "+count);
        System.out.println("Number of odd is: "+(arr.length-count));
    }
}
