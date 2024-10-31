import java.util.Arrays;
import java.util.HashMap;

public class NoOfPairs {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 3, 2, 2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }
    public static int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(nums[i])) {
                int frequency = hashmap.remove(nums[i]);
                frequency++;
                hashmap.put(nums[i], frequency);
            } else {
                hashmap.put(nums[i], 1);
            }
        }
        int count = 0;
        int noOfPairs = 0;
        int[] answer = new int[2];
        for(int key : hashmap.keySet()) {
            noOfPairs += hashmap.get(key) / 2;
            if(hashmap.get(key) % 2 != 0) {
                count++;
            }
        }
        answer[0] = noOfPairs;
        answer[1] = count;
        return answer;
    }
}
