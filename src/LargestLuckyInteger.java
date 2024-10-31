import java.util.HashMap;

public class LargestLuckyInteger {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3,  3, 3};
        System.out.println(findLucky(array));
    }
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if (hashmap.containsKey(arr[i])) {
                int frequency = hashmap.remove(arr[i]);
                frequency++;
                hashmap.put(arr[i], frequency);
            } else {
                hashmap.put(arr[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int key : hashmap.keySet()) {
            if(key == hashmap.get(key) && key > max) {
                max = key;
            }
        }
        if(max > 0) {
            return max;
        }
        else {
            return -1;
        }
    }
}
