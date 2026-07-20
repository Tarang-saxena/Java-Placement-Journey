public class SecondLargeele {
    public static void main(String[] args) {
        int arr[]= {4, 6,3,7, 9,2,5};
        int lar = Integer.MIN_VALUE;
        int secLer = Integer.MIN_VALUE;
        for(int i =0;i<arr.length; i++){
            if(arr[i] > lar){
                secLer = lar;
                lar = arr[i];
            }
            else if( arr[i]> secLer && arr[i]!= lar){
                secLer = arr[i];
            }
        }
        System.out.print("second large element is: "+secLer);
    }
}
