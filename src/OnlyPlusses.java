import java.util.Arrays;

public class OnlyPlusses {
    public static void main(String[] args) {
        int[] nums = new int[3]; // Array of size 3
        generateArrays(nums, 0, 5);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int maxProduct = Integer.MIN_VALUE;
    public static void permutations(int nums[], int index) {
        if (index == nums.length) {
            System.out.println(Arrays.toString(nums));

            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            permutations(nums, index + 1);
            swap(nums, index, i);
        }
    }

    public static void generateArrays(int[] nums, int index, int remaining) {
        if (index == nums.length) {
            if (remaining == 0) {
                permutations(nums, 0);
            }
            return;
        }
        for (int i = 0; i <= remaining; i++) {
            nums[index] = i;
            generateArrays(nums, index + 1, remaining - i);
        }
    }
}
