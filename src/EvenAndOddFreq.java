import java.util.HashMap;

public class EvenAndOddFreq {
    public static void main(String[] args) {
        String s = "abcabcab";
        System.out.println(maxDifference(s));
    }
    public static int maxDifference(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(s.charAt(i))) {
                int freq = hashMap.remove(s.charAt(i));
                freq++;
                hashMap.put(s.charAt(i), freq);
            }
            else  {
                hashMap.put(s.charAt(i), 1);
            }
        }
        int minEven = Integer.MAX_VALUE;
        int maxOdd = Integer.MIN_VALUE;
        for(Character key : hashMap.keySet()) {
            int val = hashMap.get(key);
            if((val % 2 != 0) && val > maxOdd) {
                maxOdd = val;
            } else if ((val % 2 == 0) && val < minEven) {
                minEven = val;
            }
        }
        return maxOdd - minEven;
    }
}
