public class UpperCase {
    public static void main(String[] args) {
         String str = "hello happy, how are you";
         String res = "";
         int count =1;
         int key =0;
         for(int i = 0; i<str.length(); i++){
             char ch = str.charAt(i);
             if(ch == ' '){
                 count++;
             }
             if(ch == 'h' || ch == 'H'){
                 key++;
             }
             if(ch>= 'a' && ch<= 'z'){
                 ch = (char)(ch - 32);
             }
             res += ch;
         }
        System.out.println(res);
        System.out.println("Number of key is: "+key);
        str = str.replace(" ", "");
        System.out.println(str);
        System.out.println("Number of words is: "+count);
    }
}
