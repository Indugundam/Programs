public class MonotonicArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 7};
        System.out.println(isMonotonic(array));
    }

    public static boolean isMonotonic(int[] nums) {
        if(nums.length == 1) {
            return true;
        }
        boolean isMonotonic = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                isMonotonic = true;
            } else {
                isMonotonic = false;
                break;
            }
        }
        if (isMonotonic) {
            return true;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] >= nums[i + 1]) {
                    isMonotonic = true;
                } else {
                    isMonotonic = false;
                    break;
                }
            }
        }
        return isMonotonic;
    }
}
