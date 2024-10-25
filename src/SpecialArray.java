public class SpecialArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 7};
        System.out.println(isArraySpecial(arr));
    }
    public static boolean isArraySpecial(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) || nums[i] % 2 != 0 && nums[i + 1] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
