public class UpdateValue {
    static void updatevalue(int x){
         x = x * 5;
        System.out.println("Update value: "+x);
    }
    public static void main(String[] args) {
        int x =10;
        updatevalue(x);
        System.out.println("Value: "+x);
    }
}
