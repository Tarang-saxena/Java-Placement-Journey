public class Array2D {
    public static void main(String[] args) {
       // int arr[][]= new int[3][4];
        int [][]brr = { {2,4,} ,{23,6 } ,{4,2}, {3, 6, 34}, {23,6, 4,34,6}};
       // System.out.println(brr[0][0]);
        int rowlength = brr.length;
//        int collength =brr[0].length;
        for(int i =0; i< rowlength; i++){
            // jaise hi mai kisi new row pr aungi then col nikal lo
            int collength =brr[i].length;
            for(int j =0; j< collength ; j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
