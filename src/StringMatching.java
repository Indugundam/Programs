import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        List<String> strings = stringMatching(words);
        for(String word : strings) {
            System.out.println(word);
        }
    }
    public static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(i != j && words[i].contains(words[j]) && !list.contains(words[j])) {
                    list.add(words[j]);
                }
            }
        }
        return list;
    }
}
