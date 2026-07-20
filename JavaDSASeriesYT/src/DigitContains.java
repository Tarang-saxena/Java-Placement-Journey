public class DigitContains {
    public static void main(String[] args) {
        String str ="235345";
        boolean dig = true;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch< '0'  && ch> '9'){
                 dig = false;
                 break;
            }
        }
        if(dig){
            System.out.println("All digit");
        }
        else{
            System.out.println("Not digit");
        }
    }
}
