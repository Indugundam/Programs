import java.util.HashMap;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 3, 1};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(nums[i])) {
                int frequency = hashmap.remove(nums[i]);
                frequency++;
                hashmap.put(nums[i], frequency);
            } else {
                hashmap.put(nums[i], 1);
            }
        }
        int sum = 0;

        for (int key : hashmap.keySet()) {
            if (hashmap.get(key) == 1) {
                sum = sum + key;
            }
        }

        return sum;
    }
}
