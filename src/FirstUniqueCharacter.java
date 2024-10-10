public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "leetcode";
        int index = firstUniqChar(str);
        System.out.println(index);
    }
    public static int firstUniqChar(String s) {
        int k = 0 ;
        int index = 0;
        for(k = 1; k < s.length(); k++) {
            int uniqChar = s.charAt(k);
            for (int i = k + 1; i < s.length(); i++) {
                if (uniqChar == s.charAt(i)) {
                    break;
                }
            }
        }
        return 0;
    }
}
