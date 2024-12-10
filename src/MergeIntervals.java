public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {4, 5}, 
        };
        int[][] mergedIntervals = merge(intervals);
        for(int i = 0; i < mergedIntervals.length; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(mergedIntervals[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] merge(int[][] intervals) {

        int[][] result = new int[3][2];
        int r = 0;
        int c = 0;
        int row = 0;
        int index = 0;
        while(row < intervals.length - 1) {
            c = intervals[row][1];
            r = intervals[row + 1][0];
            if(c >= r) {
                result[index][0] = intervals[row][0];
                result[index][1] = intervals[row + 1][1];
                index++;
                row += 2;
            }
            else {
                result[index][0] = intervals[row][0];
                result[index][1] = intervals[row][1];
                index++;
                row++;
            }
        }
        result[index][0] = intervals[row][0];
        result[index][1] = intervals[row][1];

        return result;
    }
}
