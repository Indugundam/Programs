import java.util.HashSet;

public class ZeroSumSubArray {
    public static boolean hasZeroSumSubarray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;

            // If prefixSum is 0 or it is already seen before
            if (prefixSum == 0 || set.contains(prefixSum)) {
                return true;
            }

            // Store prefix sum
            set.add(prefixSum);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println(hasZeroSumSubarray(arr)); // Output: true

        int[] arr2 = {4, 2, 0, 1, 6};
        System.out.println(hasZeroSumSubarray(arr2)); // Output: true

        int[] arr3 = {1, 2, 3};
        System.out.println(hasZeroSumSubarray(arr3)); // Output: false
    }
}
