public class SignOfTheArray {
    public static void main(String[] args) {
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        System.out.println(arraySign(nums));
    }
    public static int arraySign(int[] nums) {
        int sign = 1;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                sign *= -1;
            }
        }

        return sign;
    }
}
