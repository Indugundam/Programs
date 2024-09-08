import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 6;
        List<List<Integer>> rows = generate(numRows);
        for (List<Integer> row : rows) {
            System.out.println(row);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            int k = 0;
            for (int j = 1; j < i; j++) {
                row.add(rows.get(i - 1).get(k) + rows.get(i - 1).get(k + 1));
                k++;
            }
            if (i > 0) {
                row.add(1);
            }
            rows.add(row);
        }
        return rows;
    }
}
