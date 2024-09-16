import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        int n = 5;
        int[] nums = countBits(n);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int num = i;
            while (num >= 1) {
                int remainder = num % 2;
                if (remainder == 1) {
                    count++;
                }
                num = num / 2;
            }
            ans[i] = count;
        }
        return ans;
    }
}

