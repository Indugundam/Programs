public class ReverseWords {
    public static void main(String[] args) {
        String string = "Let's take LeetCode contest";
        System.out.println(reverseWords(string));
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
            for(int k = 0; k < words.length; k++) {
                for(int i = words[k].length() - 1; i >=0; i--) {
                    stringBuilder.append(words[k].charAt(i));
                }
                stringBuilder1.append(stringBuilder.toString());
                if(k != words.length - 1) {
                    stringBuilder1.append(" ");
                }
                stringBuilder.delete(0, words[k].length());
            }
            return stringBuilder1.toString();
    }
}
