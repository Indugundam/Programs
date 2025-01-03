import java.util.*;

public class SubString {
    public static void main(String[] args) {
        String s = "aaa";
        String[] words = {"a", "a"};
        List<Integer> list = findSubstring(s, words);
        System.out.println(list.toString());
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        findSubstringUtil(s, words, 0, list);
        Collections.sort(list);
        return list;
    }

    public static void swap(String[] words, int i, int j) {
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
    }

    public static void findSubstringUtil(String s, String[] words, int index, List<Integer> list) {
        // Use a HashSet for uniqueness during recursion
        Set<Integer> set = new HashSet<>(list);

        if (index == words.length) {
            // Use StringBuilder for efficient string concatenation
            StringBuilder str = new StringBuilder();
            for (String word : words) {
                str.append(word);
            }
            int k = s.indexOf(str.toString());
            while (k != -1) {
                if (set.add(k)) { // Add to set and list if not already present
                    list.add(k);
                }
                k = s.indexOf(str.toString(), k + 1);
            }
            return;
        }

        for (int i = index; i < words.length; i++) {
            swap(words, index, i);
            findSubstringUtil(s, words, index + 1, list);
            swap(words, index, i);
        }
    }

}


