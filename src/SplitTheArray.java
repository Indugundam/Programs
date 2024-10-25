import java.util.HashMap;

public class SplitTheArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,4};
        System.out.println(isPossibleToSplit(nums));
    }
    public static boolean isPossibleToSplit(int[] nums) {
        if(nums.length % 2 != 0) {
            return false;
        }
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(nums[i])) {
                int freq = hashmap.remove(nums[i]);
                freq++;
                hashmap.put(nums[i], freq);
            } else {
                hashmap.put(nums[i], 1);
            }
        }
        for(Integer key : hashmap.keySet()) {
            if(hashmap.get(key) > 2) {
                return false;
            }
        }
        return true;
    }
}
