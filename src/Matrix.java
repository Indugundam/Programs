public class Matrix {
    public static void main(String[] args) {
        int[][] grid = {
                {5, 6, 2, 6},
                {9, 2, 8, 4},
                {8, 2, 6, 1},
                {6, 2, 2, 2}
        };
        int[][] mat = largestLocal(grid);
        for(int k = 0; k < mat.length; k++) {
            for (int s = 0; s < mat[k].length; s++) {
                System.out.print(mat[k][s] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];
        for(int k = 0; k < n - 2; k++) {
            for(int s = 0; s < n - 2; s++) {
                int max = Integer.MIN_VALUE;
                for (int row = k; row < k + 3; row++) {
                    for (int col = s; col < s + 3; col++) {
                        if (grid[row][col] > max) {
                            max = grid[row][col];
                        }
                    }
                }
                maxLocal[k][s] = max;
            }
        }
        return maxLocal;
    }
}
