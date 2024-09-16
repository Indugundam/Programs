public class Perimeter {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4; // Start with maximum perimeter for each land cell

                    // Check if there is a land cell to the left
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2; // Subtract 2 for the shared edge
                    }

                    // Check if there is a land cell above
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2; // Subtract 2 for the shared edge
                    }
                }
            }
        }

        return perimeter;
    }
}