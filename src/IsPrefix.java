public class IsPrefix {
    public static void main(String[] args) {
        String s = "i love eating burger";
        String prefix = "burg";
        System.out.println(isPrefixOfWord(s, prefix));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++) {
            int index = words[i].indexOf(searchWord);
            if(index == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
