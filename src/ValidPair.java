import java.util.HashMap;

public class ValidPair {
    public static void main(String[] args) {
        String s = "221";
        System.out.println(findValidPair(s));
    }

    public static String findValidPair(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int freq = hashMap.remove(s.charAt(i));
                freq++;
                hashMap.put(s.charAt(i), freq);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }
        if(hashMap.size() == 1) return "";
        StringBuilder str = new StringBuilder();
        for (Character key : hashMap.keySet()) {
            if (Integer.parseInt(String.valueOf(key)) == hashMap.get(key)) {
                str.append(key);
            }
        }
        if(str.length() < 2) return "";
        if (s.contains(str.toString())) {
            return str.toString();
        }
        return str.reverse().toString();
    }
}
