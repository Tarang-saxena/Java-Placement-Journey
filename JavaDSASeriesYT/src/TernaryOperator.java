public class TernaryOperator {
    public static void main(String[] args) {
        int streakDays = 45;
        String status = (streakDays >= 30)? "Consistent" : "Inconsistent";
        System.out.println(status);
    }
}
