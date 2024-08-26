import java.util.HashSet;

public class ConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"abc", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> hashset = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++) {
            hashset.add(allowed.charAt(i));
        }
        for (String word : words) {
            boolean found = true;
            for (int i = 0; i < word.length(); i++) {
                if (!hashset.contains(word.charAt(i))) {
                    found = false;
                }
            }
            if (found == true) {
                count++;
            }
        }
        return count;
    }
}
