import java.util.Arrays;

public class WeakestRows {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,0,0,0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        System.out.println(Arrays.toString(kWeakestRows(matrix, 3)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] rows = new int[mat.length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == 1) {
                    rows[row]++;
                }
            }
        }
        int[] indices = new int[k];
        for (int i = 0; i < k; i++) {
            indices[i] = minIndex(rows);
        }
        return indices;
    }

    public static int minIndex(int[] rows) {
        int minIndex = 0;
        for (int i = 1; i < rows.length; i++) {
            if (rows[i] < rows[minIndex]) {
                minIndex = i;
            }
        }
        rows[minIndex] = Integer.MAX_VALUE;
        return minIndex;
    }
}
