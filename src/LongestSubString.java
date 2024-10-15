public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcabc";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            string.append(s.charAt(i));
        }
        int length = string.toString().length();
        return length;
    }
}
