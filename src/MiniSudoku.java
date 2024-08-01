import java.util.ArrayList;

public class MiniSudoku {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 6},
                {2, 7, 8},
                {9, 7, 5}
        };
        ArrayList<Integer> missingValues = sudokuMissingNumbers(matrix);
        for(int number : missingValues) {
            System.out.println(number);
        }
    }

    private static ArrayList<Integer> sudokuMissingNumbers(int[][] matrix) {
        int[] frequency = new int[10];
        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] < 1 || matrix[row][col] > 9) return null;
                frequency[matrix[row][col]]++;
            }
        }
        for (int j = 1; j < frequency.length; j++) {
            if (frequency[j] == 0) {
                missingNumbers.add(j);
            }
        }
        return missingNumbers;
    }

}
