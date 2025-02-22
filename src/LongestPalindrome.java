public class LongestPalindrome {
    public static void main(String[] args) {
    String s = "cbbd";
    System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String longestPalindrome = "";
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j < s.length(); j++) {
                StringBuilder str = new StringBuilder();
                str.append(s.substring(i, j));
                if(j == s.length()) str.append(s.charAt(j - 1));
                System.out.println(str.toString());
                if(str.toString().equals(str.reverse().toString()) && str.length() > longestPalindrome.length()) {
                    longestPalindrome = str.toString();
                }
            }
        }
        return longestPalindrome;
    }
}
