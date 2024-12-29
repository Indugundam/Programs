import java.util.Arrays;
import java.util.HashSet;

public class DistinctAverages {
    public static void main(String[] args) {
        int[] nums = {9,5,7,8,7,9,8,2,0,7};
        System.out.println(distinctAverages(nums));
    }
    public static int distinctAverages(int[] nums) {
        HashSet<Double> hashset = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n / 2; i++) {
            double avg = (nums[i] + nums[n - i - 1]) / 2.0;
            System.out.println(avg);
            hashset.add(avg);
        }
        return hashset.size();
    }
}
