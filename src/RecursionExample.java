
import java.util.Arrays;

public class RecursionExample {
    public int factorial(int n) { // O(n)
        if (n == 1 || n == 0) return 1;

        return n * factorial(n - 1);
    }

    // O(1) < O(lgn) < O(n) < O(nlgn) < O(n^2) < O(n^3) < O(2^n)

    // x^n => Iterative approach  O(n)

    // 2^8 = (2^4) * (2^4)


    public int power(int x, int n) { // lgn // 2 , 4
        if (n == 1) return x;

        int res = power(x, n / 2);
        if (n % 2 == 0) {
            return res * res;
        } else {
            return x * res * res;
        }
    }

    public int fibb(int n) {
        if (n == 1 || n == 0) return n;

        return fibb(n - 1) + fibb(n - 2);
    }



    public static int fibb2Util(int n) {
        int result[] = new int[100];
        Arrays.fill(result, -1);
        return fibb2(10, result);
    }

    public static int fibb2(int n, int[] result) {
        if (n == 1 || n == 0) {
            result[n] = n;
            return n;
        }

        if (result[n] != -1) return result[n];

        result[n] = fibb2(n - 1, result) + fibb2(n - 2, result);
        System.out.println(result[n]);

        return result[n];
    }

    public static void main(String[] args) {
        fibb2Util(5);
        fibb3Util(10);
    }
    public static int fibb3Util(int n) {
        int level[] = new int[1];
        Arrays.fill(level, -1);
        int res = fibb3(10, level, 0);
        System.out.println("level = " + level[0]);
        System.out.println(res);
        return res;
    }

    public static int fibb3(int n, int[] level, int curr_level) {
        level[0] = Math.max(level[0], curr_level);

        if (n == 1 || n == 0) {
            return n;
        }

        return fibb3(n - 1, level, curr_level + 1) + fibb3(n - 2, level, curr_level + 1);
    }
}