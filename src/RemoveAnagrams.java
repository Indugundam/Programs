import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagrams {
    public static void main(String[] args) {
        String[] words = {"abba","baba","bbaa","cd","cd"};
        List<String> strings = removeAnagrams(words);
        System.out.println(strings.toString());
    }
    public static List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        String[] strings = new String[words.length];
        for(int i = 0; i < strings.length; i++) {
            char[] charArray = words[i].toCharArray();
            Arrays.sort(charArray);
            strings[i] = charArray.toString();
            System.out.println(strings[i]);
        }
        for(int j = 1; j < strings.length; j++) {
            if(strings[j].equals(strings[j - 1])) {
//                if(!list.contains(strings[j - 1])) {
                    list.add(words[j - 1]);
                }
//            }
        }
        return list;
    }
}
