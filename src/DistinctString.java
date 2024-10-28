import java.util.HashMap;

public class DistinctString {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr, k));
    }
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        for (String word : arr) {
            if (hashmap.containsKey(word)) {
                int frequency = hashmap.remove(word);
                frequency++;
                hashmap.put(word, frequency);
            } else {
                hashmap.put(word, 1);
            }
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(hashmap.get(arr[i]) == 1) {
                count++;
            }
            if(count == k) {
                return arr[i];
            }
        }
        return "";
    }
}
