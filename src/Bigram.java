import java.util.ArrayList;
import java.util.HashSet;

public class Bigram {
    public static void main(String[] args) {
        String str = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
        String[] words = findOcurrences(str, first, second);
        for(String word : words) {
            System.out.println(word);
        }
    }
    public static String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        ArrayList<String> arrayList  = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals(first) && words[i + 1].equals(second)) {
                arrayList.add(words[i + 2]);
            }
        }
        int i = 0;
        String[] result = new String[arrayList.size()];
        for(String str : arrayList) {
            result[i++] = str;
        }
        return result;
    }
}

