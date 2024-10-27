import java.util.ArrayList;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5};
        int k = 806;
        List<Integer> list = addToArrayForm(nums, k);
        System.out.println(list);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < num.length; i++) {
            stringBuilder.append(num[i]);
        }
        long sum = Integer.parseInt(stringBuilder.toString()) + k;
        String str = sum + "";
        int[] nums = new int[str.length()];
        int i = 0;
        while(sum > 0) {
            long rem = sum % 10;
            sum = sum / 10;
            nums[i++] = (int)rem;
        }
        for(int j = nums.length - 1; j >= 0; j--) {
            list.add(nums[j]);
        }
        return list;
    }
}
