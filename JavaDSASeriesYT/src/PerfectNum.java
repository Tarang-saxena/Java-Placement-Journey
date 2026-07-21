public class PerfectNum {
    static boolean CheckPerfectNumber(int num){
        int sum =1;
        for(int i =2; i*i <= num;i++){
            if(num %i == 0){
                int frifact = i;
                int secfact = num/i;
                sum  +=frifact+ secfact;
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println( CheckPerfectNumber(6));
    }
}
