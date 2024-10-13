import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "leetcode";
        int index = firstUniqChar(str);
        System.out.println(index);
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (hashmap.containsKey(key)) {
                int freq = hashmap.remove(key);
                freq++;
                hashmap.put(key, freq);
            } else {
                hashmap.put(key, 1);
            }
        }
        for (char key : hashmap.keySet()) {
            if (hashmap.get(key) == 1) {
                index = getIndex(key, s);
                return index;
            }
        }
        return -1;
    }

    public static int getIndex(Character ch, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
