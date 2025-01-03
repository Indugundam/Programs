public class PrefixOfArray {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s, words));
    }
    public static boolean isPrefixString(String s, String[] words) {
//        StringBuilder str = new StringBuilder();
//        for(String word : words) {
//            str.append(word);
//        }
//        if(str.toString().startsWith(s)) {
//            return true;
//        }
//        return false;
        int index = 0;
        for(int i = 0; i < words.length; i++) {
            int startIndex = s.indexOf(words[i]);
            System.out.println(startIndex);
            if(startIndex != index) return false;
            else {
                index += startIndex;
            }
        }
        return true;
    }
}
