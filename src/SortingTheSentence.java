public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];
        for(String word : words) {
            StringBuilder str = new StringBuilder();
            str.append(word);
            str.deleteCharAt(word.length() - 1);
            int index = Integer.parseInt(String.valueOf(word.charAt(word.length() - 1)));
            sortedWords[index - 1] = str.toString();
        }
        StringBuilder sentence = new StringBuilder();
        for(String word : sortedWords) {
            sentence.append(word + " ");
        }

        return sentence.toString().trim();
    }
}
