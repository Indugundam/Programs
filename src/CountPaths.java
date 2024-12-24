import java.util.ArrayList;
import java.util.List;

public class CountPaths {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 5},
                {7, 10, 0},
                {12, 6, 4}
        };
        int k = 11;
        System.out.println(countPathsWithXorValue(grid, k));
    }

    public static int countPathsWithXorValue(int[][] grid, int k) {
        List<List<Integer>> allPaths = new ArrayList<>();
        findPaths(grid, k, 0, 0, new ArrayList<>(), allPaths);
        return allPaths.size();
    }

    private static void findPaths(int[][] grid, int k, int row, int col, List<Integer> currentPath, List<List<Integer>> allPaths) {
        int rows = grid.length;
        int cols = grid[0].length;
        currentPath.add(grid[row][col]);
        if (row == rows - 1 && col == cols - 1) {
            int xorValue = 0;
            for (int num : currentPath) {
                xorValue ^= num;
            }
            if (xorValue == k) {
                allPaths.add(new ArrayList<>(currentPath));
            }
        } else {
            if (col + 1 < cols) {
                findPaths(grid, k, row, col + 1, currentPath, allPaths);
            }
            if (row + 1 < rows) {
                findPaths(grid, k, row + 1, col, currentPath, allPaths);
            }
        }
        currentPath.remove(currentPath.size() - 1);
    }
}
