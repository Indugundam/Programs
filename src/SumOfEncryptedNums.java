public class SumOfEncryptedNums {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        System.out.println(sumOfEncryptedInt(nums));
    }
    public static int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            int count = 0;
            while(nums[i] > 0) {
                int rem = nums[i] % 10;
                nums[i] = nums[i] / 10;
                if(rem > max) {
                    max = rem;
                }
                count++;
            }
            StringBuilder string = new StringBuilder();
            for(int k = 0; k < count; k++) {
                string.append(max);
            }
            sum += Integer.parseInt(string.toString());
        }
        return sum;
    }
}
