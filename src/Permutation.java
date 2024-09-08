import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        nextPermutation(nums);
    }
    public static void nextPermutation(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++) {
            if(nums[i] < nums[i + 1]) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[i + 2];
                nums[i + 2] = temp;
            }
            else {
                Arrays.sort(nums);
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
