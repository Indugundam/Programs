import java.util.ArrayList;
import java.util.Arrays;

public class ParityArray {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(array)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        int[] array = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                array[j] = nums[i];
                j += 2;
            } else {
                arraylist.add(nums[i]);
            }
        }
        int k = 0;
        for (int i = 1; i < array.length; i += 2) {
            array[i] = arraylist.get(k);
            k++;
        }
        return array;
    }
}
