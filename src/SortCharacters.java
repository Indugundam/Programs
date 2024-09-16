import java.util.HashMap;

public class SortCharacters {
    public static void main(String[] args) {
        frequencySort("tree");
    }
    public static String frequencySort(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(hashmap.containsKey(s.charAt(i))) {
                int frequency = hashmap.remove(s.charAt(i));
                frequency++;
                hashmap.put(s.charAt(i), frequency);
            }
            else {
                hashmap.put(s.charAt(i), 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(Character ch : hashmap.keySet()) {
            if(hashmap.get(ch) > max) {
            }
        }
        System.out.println(hashmap);
        return null;
    }
}
