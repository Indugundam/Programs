import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {5, 2, 2, 3, 4};
        System.out.println(noOfIndices(heights));
    }
    
    private static int noOfIndices(int[] heights) {
        int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}
