public class calculatePercentage {
    static float calPer(float obtained, int total){
        float p = obtained / total *100 ;
        return p;
    }
    public static void main(String[] args) {
        float per = calPer(465,500);
        System.out.println("Percentage is: "+per +"%");
    }
}
