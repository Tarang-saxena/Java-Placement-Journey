public class CallByValue {
    static void solve(int n){
        System.out.println("Inside num "+n);
        n = n*10;
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println("Inside main: "+n);
        solve(n);
        System.out.println("Inside main: "+n);
    }
}
