import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MadSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }
            System.out.println(solve(a));
        }
        sc.close();
    }

    static long solve(int[] a) {
        int[] arr1 = computeMaxDuplicates(a);
        int[] arr2 = computeMaxDuplicates(arr1);

        long sumA = 0;
        for (int num : a) {
            sumA += num;
        }

        long sumMax1 = 0;
        for (int num : arr1) {
            sumMax1 += num;
        }

        long sumMax2 = 0;
        for (int i = 0; i < arr2.length; ++i) {
            sumMax2 += (long) (arr2.length - i) * arr2[i];
        }

        return sumA + sumMax1 + sumMax2;
    }

    static int[] computeMaxDuplicates(int[] values) {
        int[] result = new int[values.length];
        int maxDuplicate = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < values.length; ++i) {
            int currentValue = values[i];
            count.put(currentValue, count.getOrDefault(currentValue, 0) + 1);

            if (count.get(currentValue) >= 2) {
                maxDuplicate = Math.max(maxDuplicate, currentValue);
            }
            result[i] = maxDuplicate;
        }
        return result;
    }
}