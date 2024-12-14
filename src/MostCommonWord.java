import java.util.ArrayList;
import java.util.HashMap;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph,banned));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        ArrayList<String> arraylist = new ArrayList<>();
        for(String str : banned) {
            arraylist.add(str);
        }
        String[] words = paragraph.split("[^a-zA-Z]+");
        HashMap<String, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            if(hashmap.containsKey(words[i])) {
                int freq = hashmap.remove(words[i]);
                freq++;
                hashmap.put(words[i], freq);
            }
            else {
                hashmap.put(words[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        String MCword = "";
        for(String key : hashmap.keySet()) {
            if(hashmap.get(key) > max && !arraylist.contains(key)) {
                max = hashmap.get(key);
                MCword = key;
            }
        }
        return MCword;
    }
}
