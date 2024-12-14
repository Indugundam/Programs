import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }
            else {
                arraylist.add(nums[i]);
            }
        }
        int index = 0;
        for(int i = 0; i < arraylist.size(); i++) {
            nums[i] = arraylist.get(i);
            index = i;
        }
        for(int i = index + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
