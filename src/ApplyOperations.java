import java.util.ArrayList;
import java.util.Arrays;

public class ApplyOperations {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
    public static int[] applyOperations(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }
            else {
                arrayList.add(nums[i]);
            }
        }
        int[] array = new int[nums.length];
        for(int k = 0; k < arrayList.size(); k++) {
            array[k] = arrayList.get(k);
        }
        System.out.println(arrayList);
        int i = arrayList.size();
        while(count < 0) {
            array[i++] = 0;
            count--;
        }
        return array;
    }
}
