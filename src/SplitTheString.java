import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SplitTheString {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("one.two.three", "four.five", "six"));
        char seperator = '.';
        List<String> list = splitWordsBySeparator(words, seperator);
        for(String word : list) {
            System.out.println(word);
        }
    }
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for(String str : words) {
            String[] strings = str.split(Pattern.quote(String.valueOf(separator)));
            System.out.println(strings.length);
            for(String s : strings) {
                list.add(s);
            }
        }

        return list;
    }
}
