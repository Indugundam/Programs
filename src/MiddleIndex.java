public class MiddleIndex {
    public static void main(String[] args) {
        int[] array = {2, 3, -1, 8, 4};
        System.out.println(findMiddleIndex(array));
    }
    public static int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        sum = sum - nums[0];
        if(sum == 0) {
            return 0;
        }
        int sum1 = 0;
        for(int i = 1; i < nums.length; i++) {
            sum = sum - nums[i];
            sum1 += nums[i - 1];
            if(sum == sum1) {
                return i;
            }
        }
        return -1;
    }
}
