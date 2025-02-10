import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] arr = {3, 9, 12, 16, 20};
        int k = 3;
        System.out.println(minDifference(arr, k));
    }
    public static int minDifference(int[] arr, int k) {

        Arrays.sort(arr);
        return (arr[arr.length - 1] - k) - (arr[0] + k);

    }
}
