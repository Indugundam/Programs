import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(maximumProduct(nums));
    }

    private static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int product = (nums[length - 1] - 1) * (nums[length - 2] - 1);
        return product;
    }
}
