import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagrams {
    public static void main(String[] args) {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        List<String> strings = removeAnagrams(words);
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        String[] strings = new String[words.length];
        for (int i = 0; i < strings.length; i++) {
            char[] charArray = words[i].toCharArray();
            Arrays.sort(charArray);
            strings[i] = Arrays.toString(charArray);
        }
        for (int j = 1; j < strings.length; j++) {
            if (!list.contains(strings[j])) {
                list.add(words[j]);
            }
        }
        return list;
    }
}
