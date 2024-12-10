public class MinimumAverage {
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }
    public static double minimumAverage(int[] nums) {
        double[] averages = new double[nums.length / 2];
        double min = Integer.MAX_VALUE;
        for(int i = 0; i < averages.length; i++) {
            int minIndex = findMinIndex(nums);
            int maxIndex = findMaxIndex(nums);
            double avg = (double) (nums[minIndex] + nums[maxIndex]) / 2;
            nums[minIndex] = 0;
            nums[maxIndex] = 0;
            averages[i] = avg;
            if(min > avg) {
                min = avg;
            }
        }
        return min;

    }

    public static int findMinIndex(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min && array[i] != 0) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int findMaxIndex(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max && array[i] != 0) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}
