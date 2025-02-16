import java.util.HashMap;

public class ReorganizeString {
    public static void main(String[] args) {
        String s = "aaab";
        System.out.println(reorganizeString(s));
    }
    public static String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        String[] sets = s.split("[a-z0=9]+@[a-z]+.com");
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int freq = map.remove(s.charAt(i));
                map.put(s.charAt(i), freq);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
            }
        }
        if(max == s.length() - 1) {
            return "";
        }
        return "";
    }
}
