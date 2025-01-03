import java.util.HashMap;
import java.util.HashSet;

public class Occurence {
    public static void main(String[] args) {
        String s = "aaab";
        System.out.println(areOccurrencesEqual(s));
    }
    public static boolean areOccurrencesEqual(String s) {
//        int xor = 0;
//        for(int  i = 0; i < s.length(); i++) {
//            xor = xor ^ s.charAt(i);
//        }
//        if(xor == 0) return true;
//        else {
//            if ((char) (xor) == s.charAt(0)) return true;
//            else return false;
//        }
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(hashmap.containsKey(s.charAt(i))) {
                int freq = hashmap.remove(s.charAt(i));
                freq++;
                hashmap.put(s.charAt(i), freq);
            }
            else {
                hashmap.put(s.charAt(i), 1);
            }
        }
        HashSet<Integer> hashset = new HashSet<>();
        for(Character ch : hashmap.keySet()) {
            hashset.add(hashmap.get(ch));
        }
        if(hashset.size() == 1) return true;
        return false;
    }
}
