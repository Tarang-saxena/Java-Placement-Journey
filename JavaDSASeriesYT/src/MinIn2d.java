public class MinIn2d {
    public static void main(String[] args) {
        int arr[][] = {{32,64,766}, {64, 34, 744,45}, {48, 284,24,64}};
        int min = arr[0][0];
        for(int i =0; i< arr.length;i++){
            for(int j= 0; j<arr[i].length;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.print("Minimum value is: "+min);
    }
}
