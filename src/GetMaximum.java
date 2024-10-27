public class GetMaximum {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(getMaximumGenerated(n));
    }
    public static int getMaximumGenerated(int n) {
        int[] nums= new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
         for(int i = 1; i < nums.length / 2; i++) {
             nums[2 * i] = nums[i];
             nums[(2 * i) + 1] = nums[i] + nums[i + 1];
         }
         int max = Integer.MIN_VALUE;
         for(int i = 0; i < nums.length; i++) {
             if(nums[i] > max) {
                 max = nums[i];
             }
         }
         return max;
    }
}
