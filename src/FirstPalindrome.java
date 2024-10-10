public class FirstPalindrome {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
    public static String firstPalindrome(String[] words) {
        for(String word : words) {
            if(isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
