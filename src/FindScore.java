public class FindScore {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4, 5, 2};
        System.out.println(findScore(array));
    }

    public static long findScore(int[] nums) {
        long score = 0;
        boolean[] marked = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int minIndex = -1;
            int min = Integer.MAX_VALUE;

            // Find the smallest unmarked value
            for (int j = 0; j < nums.length; j++) {
                if (!marked[j] && nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }

            // If all elements are marked, break the loop
            if (minIndex == -1) {
                break;
            }

            // Update the score with the selected value
            score += nums[minIndex];

            // Mark the chosen index and its neighbors
            marked[minIndex] = true;
            if (minIndex > 0) {
                marked[minIndex - 1] = true;
            }
            if (minIndex < nums.length - 1) {
                marked[minIndex + 1] = true;
            }
        }

        return score;
    }
}
