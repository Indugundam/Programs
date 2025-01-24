
public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for(int i = words.length - 1; i >= 0; i--) {
            if(!words[i].equals(" ")) {
                str.append(words[i] + " ");
            }
        }
        return str.toString().trim();
    }
}
