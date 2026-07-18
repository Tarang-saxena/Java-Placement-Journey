public class square {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++){
            for(int j =1; j<=5; j++){
            System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =1; i<=10 ;i++){
            if(i ==5){
                break; // continue only skip 5
            }
            System.out.print(i+" ");
        }
    }
}
