import java.util.Arrays;

public class LeftRightDifferences {
    public static void main(String[] args) {
        int[] nums = {12, 8, 6, 4};
        int[] answer = leftRightDifference(nums);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int i = 0;
        while (i < nums.length) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = i - 1; j >= 0; j--) {
                leftSum += nums[j];
            }

            for (int k = i + 1; k < nums.length; k++) {
                rightSum += nums[k];
            }

            answer[i] = Math.abs(leftSum - rightSum);
            i++;
        }
        return answer;
    }
}
