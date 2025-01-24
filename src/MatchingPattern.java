public class MatchingPattern {
    public static void main(String[] args) {
        String s = "luck";
        String p = "u*";
        System.out.println(hasMatch(s, p));
    }
    public static boolean hasMatch(String s, String p) {
        String[] words = p.split("\\*");
        if (words.length == 0) return true;
        if (words.length == 1 && s.indexOf(words[0]) != -1) return true;
        int firstWordIndex = s.indexOf(words[0]);
        if (firstWordIndex == -1) return false;
        else {
            int index = firstWordIndex + words[0].length();
            int secondWordIndex = s.indexOf(words[1], index);
            return secondWordIndex != -1;
        }
    }
}
