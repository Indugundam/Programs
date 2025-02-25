import java.util.HashMap;

public class MaximumFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 3, 5, 4};
        System.out.println(maxFrequencyElements(array));
    }
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int freq = map.remove(nums[i]);
                freq++;
                map.put(nums[i], freq);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for(int key : map.keySet()) {
            System.out.println(map.get(key));
            if(map.get(key) > max) {
                sum = 0;
                sum += map.get(key);
                max = map.get(key);
            }
            else if(map.get(key) == max) {
                sum += map.get(key);
            }
        }
        return sum;
    }
}
