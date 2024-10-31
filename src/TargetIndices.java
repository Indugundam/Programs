import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 3, 2, 4, 5};
        int target = 2;
        List<Integer> list = targetIndices(nums, target);
        for(int num : list) {
            System.out.println(num);
        }
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
