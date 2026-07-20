public class GetMAx {
    static int GetMax(int a, int b){
        if(a>b){
            return a;
        }
        else
                {
                      return b;
                }
    }
    public static void main(String[] args) {
      int max=  GetMax(6,8);
        System.out.println("Maximum number is: "+max);
    }
}
