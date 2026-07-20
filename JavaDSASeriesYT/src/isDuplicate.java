public class isDuplicate {
    public static void main(String[] args) {
        int arr[]= {4, 6,3,7, 9,2,5,6,3,9,8};
          for(int j =0; j<arr.length;j++){
           boolean   isDuplicate =false;
            for(int i=0; i<j;i++){
                if(arr[j] == arr[i] ){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(arr[j]+" ");
            }
          }
    }
}
