public class FindChar {
    static int GetLength(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }
    public static void main(String[] args) {
        String str = "Heer";
        // Use str.tochararray
        for(int i =0; i<str.length();i++){
            System.out.println(str.charAt(i));
            System.out.println(GetLength(str));
        }
    }
}
