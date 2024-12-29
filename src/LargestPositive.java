import java.util.Arrays;
import java.util.HashSet;

public class LargestPositive {
    public static void main(String[] args) {
        int[] nums = {-1,2,-3,3};
        System.out.println(findMaxK(nums));
    }
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            System.out.println("Hi");
            if(nums[end] == Math.abs(nums[start])) {
                return nums[end];
            }
            else if(nums[end] < Math.abs(nums[start])) {
                start++;
            }
            else {
                end--;
            }
        }
        return -1;
    }
}

