import java.util.Arrays;

public class FindBuilding {
    public static void main(String[] args) {
        int[] heights = {6, 4, 8, 5, 2, 7};
        int[][] queries = {
                {0, 1}, {0, 3}, {2, 4}, {3, 4}, {2, 2}
        };
        System.out.println(Arrays.toString(leftmostBuildingQueries(heights, queries)));
    }

    public static int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int[] meet = new int[queries.length];
        boolean canMeet = false;
        for (int i = 0; i < queries.length; i++) {
            int max = Math.max(queries[i][0], queries[i][1]);
            canMeet = false;
            while (!canMeet && max < heights.length) {
                if (heights[queries[i][0]] <= heights[max] && heights[queries[i][1]] <= heights[max]) {
                    canMeet = true;
                    meet[i] = max;
                } else {
                    max++;
                }
            }
            if (max == heights.length && meet[i] == 0) {
                meet[i] = -1;
            }
        }
        return meet;
    }
}
