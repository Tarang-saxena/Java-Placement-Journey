public class armstrongNum {

    static boolean isarmstrong(int num){
        int sum =0;
        int ori = num;
        while(num !=0 ){
            int d = num%10;
            int cube = d *d*d;
            sum += cube;
            num = num/10;
        }
        if(sum == ori){
            System.out.println("Armstrong number: "+ori);
            return true;
        }
        else{
            System.out.println("Not Armstrong number: "+ori);
            return false;
        }
    }
    public static void main(String[] args) {
        isarmstrong(153);
    }
}
