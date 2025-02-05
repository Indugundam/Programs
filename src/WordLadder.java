import java.util.Arrays;
import java.util.List;

public class WordLadder {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("a", "b", "c");
        String beginWord = "a";
        String endWord = "c";
        System.out.println(ladderLength(beginWord, endWord, wordList));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }

        int ladderCount = 1;
        int index = -1;

        // Find the first word in wordList that differs by one letter from beginWord
        for (int i = 0; i < wordList.size(); i++) {
            int diffCount = 0;
            for (int j = 0; j < beginWord.length(); j++) {
                if (beginWord.charAt(j) != wordList.get(i).charAt(j)) {
                    diffCount++;
                }
            }
            if (diffCount == 1) {
                index = i;
                ladderCount++;
                break;
            }
        }

        // If no valid transformation from beginWord, return 0
        if (index == -1) {
            return 0;
        }

        // Traverse wordList from index and count ladder steps
        for (int k = index; k < wordList.size(); k++) {
            int diffCount = 0;
            for (int j = 0; j < beginWord.length(); j++) {
                if (wordList.get(k).charAt(j) != endWord.charAt(j)) {
                    diffCount++;
                }
            }
            if (diffCount == 1) {
                ladderCount++;
                break;
            }
        }

        return ladderCount;
    }
}
