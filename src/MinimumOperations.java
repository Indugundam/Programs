public class MinimumOperations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 7};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        int noOfOperations = 0;
        for (int num : nums) {
            if (num % 3 == 1 || num % 3 == 2) {
                noOfOperations++;
            }
        }
        return noOfOperations;
    }
}

