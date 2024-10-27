public class Convert1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int m = 1;
        int n = 1;
        int[][] matrix = construct2DArray(nums, m, n);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] array = new int[m][n];
        if(m * n != original.length) {
            return array;
        }
        int k = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                array[i][j] = original[k];
                k++;
            }
        }
        return array;
    }
}
