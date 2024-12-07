import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashset = new HashSet<>();
        int length = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++) {
            if(hashset.contains(s.charAt(i))) {
                length = hashset.size();
                System.out.println(length);
                for(int j = i; j >= 0; j--) {
                    hashset.remove(s.charAt(j));
                }
            }
            else{
                hashset.add(s.charAt(i));
            }
            if(length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
