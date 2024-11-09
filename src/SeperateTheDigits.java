import java.util.Arrays;

public class SeperateTheDigits {
    public static void main(String[] args) {
        int[] array = {12, 4, 35, 17};
        System.out.println(Arrays.toString(separateDigits(array)));
    }
    public static int[] separateDigits(int[] nums) {
        String[] strings = new String[nums.length];
        int length = 0;
        for(int i = 0; i < strings.length; i++) {
            strings[i] = nums[i] + "";
            length += strings[i].length();
        }
        int[] array = new int[length];
        for(int num : nums) {
        }
        return array;
    }
}
