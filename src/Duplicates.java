import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicates(nums));

    }

    public static boolean containsDuplicates(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashset.contains(nums[i])) {
                return true;
            }
            hashset.add(nums[i]);
        }
        return false;
    }
}
