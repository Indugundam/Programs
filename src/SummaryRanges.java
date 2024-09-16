import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> list = summaryRanges(nums);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            index = i;
            boolean isConsecutive = false;
            if (nums[i + 1] == nums[i] + 1) {
                isConsecutive = true;
                count++;
            }

            if ((count == 1) && isConsecutive) {
                list.add(nums[i] + "->");
            } else if ((count > 1) && isConsecutive) {
                continue;
            } else if (!isConsecutive) {
                count = 0;
                list.add(nums[i] + "");
            }
        }
        if (nums[index] + 1 == nums[index + 1]) {
            list.add(nums[index + 1] + "");
        } else {
            list.add(nums[index + 1] + "");
        }
        return list;
    }
}
