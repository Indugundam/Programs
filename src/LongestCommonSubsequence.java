import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        int[] nums = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] arr) {
        int maxLength = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(1);
        System.out.println(list);

        int currLength = 1;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) continue;  // Skip duplicates

            if (arr[i] + 1 == arr[i + 1]) {
                currLength++;
            } else {
                maxLength = Math.max(maxLength, currLength);
                currLength = 1;  // Reset for a new sequence
            }
        }
        return Math.max(maxLength, currLength);
    }
}
