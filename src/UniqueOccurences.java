import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurences {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for(int val : arr) {
            if(hashMap.containsKey(val)) {
                int freq = hashMap.remove(val);
                freq++;
                hashMap.put(val, freq);
            }
            else {
                hashMap.put(val, 1);
            }
        }
        for(int key : hashMap.keySet()) {
            if(hashSet.contains(hashMap.get(key))) {
                return false;
            }
            else {
                hashSet.add(hashMap.get(key));
            }
        }
        return true;
    }
}
