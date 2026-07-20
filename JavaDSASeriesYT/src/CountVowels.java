public class CountVowels {
    static String Reverse(String str){
        String rev= "";
        int n = str.length();
        for(int i =n-1; i>=0; i--){
            char ch =str.charAt(i);
            rev = rev + ch;
        }
        return rev;
    }
    static boolean isPalindrome(String str){
        String ori = str;
        String rev = Reverse(ori);
        for(int i =0 ;i< ori.length();i++){
            char ch = ori.charAt(i);
            char ch2 = rev.charAt(i);
            if(ch != ch2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "noon";

        int count =0;
        for(int i =0 ;i<str.length();i++){

            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Number of vowels is: "+count);
        System.out.println(Reverse(str));
        System.out.println(isPalindrome(str));
    }
}
