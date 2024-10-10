public class MaximumWords {
    public static void main(String[] args) {
        String text = "leet code";
        String brokenLetters = "e";
        System.out.println(canBeTypedWords(text, brokenLetters));
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        char[] charArray = brokenLetters.toCharArray();
        String[] words = text.split(" ");
        int count = words.length;
        for(String word : words) {
            for(char ch : charArray) {
                if(word.contains(ch + "")) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
