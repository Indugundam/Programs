public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 9, 10};
        System.out.println(findGCD(array));
    }
    public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        int gcd = 0;
        for(int i = 1; i <= min; i++) {
            if(min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
