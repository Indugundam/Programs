public class SetToZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int[][] matrix1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setToZeros(matrix);
        System.out.println();
        setToZeros(matrix1);
    }

    public static void setToZeros(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                result[row][col] = matrix[row][col];
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0) {
                    for (int i = 0; i < matrix[row].length; i++) {
                        result[row][i] = 0;
                    }
                    for (int j = 0; j < matrix.length; j++) {
                        result[j][col] = 0;
                    }
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(result[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
