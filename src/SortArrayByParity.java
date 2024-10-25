import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            }
        }
        for (int i = 0; i < evenCount; i++) {
            for (int j = evenCount; j < nums.length; j++) {
                if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        return nums;
    }
}
