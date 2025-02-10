import java.util.ArrayList;
import java.util.List;

public class ZigZagGrid {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> list = zigzagTraversal(grid);
        System.out.println(list);
    }
    public static List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int index = 0;
        int[] array = new int[m * n];
        for(int i = 0; i < m; i++) {
            if((i % 2) == 0) {
                for(int j = 0; j < n; j++) {
                    array[index++] = grid[i][j];
                }
            }
            else {
                for(int j = n - 1; j >= 0; j--) {
                    array[index++] = grid[i][j];
                }
            }
        }
        for(int k = 0; k < array.length; k += 2) {
            list.add(array[k]);
        }

        return list;
    }
}
