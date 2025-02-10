public class CountInversions {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6};
        System.out.println(countInversions(nums));
    }
    public static int countInversions(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i  + 1 ; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
