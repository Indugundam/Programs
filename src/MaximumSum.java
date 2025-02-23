import java.util.PriorityQueue;

class Pair {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class MaximumSum {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2},
                {3, 4}
        };
        int[] limit = {1, 2};
        int k = 2;
        System.out.println(maxSum(grid, limit, k));
    }
    public static long maxSum(int[][] grid, int[] limits, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.key - a.key);
        long sum = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                pq.add(new Pair(grid[i][j], i));
            }
        }
        while(k > 0) {
            Pair p = pq.poll();
            if(limits[p.value] > 0) {
                sum += p.key;
                limits[p.value]--;
                k--;
            }
        }
        return sum;
    }
}
