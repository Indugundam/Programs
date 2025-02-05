public class MazeProblem {
    static int mat[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
    static boolean visited[][] = new boolean[4][4];
    static int I = 3;
    static int J = 3;
    public static void main(String[] args) {
        traverse(0, 0);
    }
    public static void traverse(int i, int j) {
        if (i < 0 || j < 0 || i >= 4 || j >= 4) return;
        if (i == I && j == J) {
            System.out.println(i + " " + j);
            System.out.println("Found a solution");
            return;
        }
        if (mat[i][j] == 0) return; // blocked cell
        if (visited[i][j]) return;
        System.out.println(i + " " + j);
        visited[i][j] = true;
        traverse(i, j + 1); // right;
        traverse(i + 1, j); // down;
        traverse(i, j - 1); // left;
        traverse(i - 1, j); // up;
        visited[i][j] = false;

    }

}
