public class ReplaceDigits {
    public static void main(String[] args) {
        String str = "a1c1e1";
        System.out.println(replaceDigits(str));
    }
    public static String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        for(int  i = 0; i < s.length(); i++) {
            if(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                str.append((char)(s.charAt(i - 1) + Integer.parseInt(String.valueOf(s.charAt(i)))));
            }
            else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
