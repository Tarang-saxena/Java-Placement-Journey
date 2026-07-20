public class Methods {
    //declaration or definition
    static void Print2Table(){
        for(int i =1 ; i<=10; i++){
            int ans = 2*i;
            System.out.println(ans+" ");
        }
    }
    static void Printsum(int x ,  int y){
        System.out.println("sum: " +(x + y));
    }
    static int add(int a, int b){
        int s = a +b ;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Hye");
        Print2Table();  // Method call
        System.out.println("Heer");
        Printsum(4,6);    //Arguments
        int result = add(7,8);
        System.out.println(result);
    }
}
