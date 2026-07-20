public class Multi2DArray {
    public static void main(String[] args) {
        int arr[][] ={ {3,2,1 }, {2, 1,}};
        int ans = 1;
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                ans*=arr[i][j];
            }
        }
        System.out.print("answer is: "+ans);
    }
}
