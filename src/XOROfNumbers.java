import java.util.HashMap;

public class XOROfNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        System.out.println(duplicateNumbersXOR(nums));
    }
    public static int duplicateNumbersXOR(int[] nums) {
        int xor = 0;
        System.out.println(xor ^ 5);
        HashMap<Integer, Integer> map = new HashMap<>();
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
            if(map.get(key) == 2) {
                xor = xor ^ key;
            }
            System.out.println(key + " " + map.get(key));
        }
        return xor;
    }
}
