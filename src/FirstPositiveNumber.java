import java.util.ArrayList;
import java.util.Arrays;

public class FirstPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {2, -1, 0, 3};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        // int posCount = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] > 0) {
        //         posCount++;
        //     }
        // }
        // int[] array = new int[posCount];
        // int index = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && !arrayList.contains(nums[i])) {
                arrayList.add(nums[i]);
                // index++;
            }
        }
        int num = 1;
        for(int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) == num) {
                num++;
            }
            else {
                return num;
            }
        }
        return num;
    }
}
