public class MinimumCost {
    public static void main(String[] args) {
        int[] arr = {5, 9, -4, 2, -7, -3, -4, 2};
        int mincost = minCost(arr);
        System.out.println(mincost);
    }

    public static int minCost(int[] a) {
        int p = 0;
        int n = 0;
        int len = a.length;
        int cost = 0;
        int badges;
        while(p < len && a[p] < 0) {
            p++;
        }
        while(n < len && a[n] >= 0) {
            n++;
        }
        while(p < len && n < len) {
            int abs = a[n] * -1;
            badges = Math.min(a[p], abs);
            cost += (Math.abs(p - n) * badges);
                a[p] -= badges;
                a[n] += badges;
            while(p < len && a[p] <= 0) {
                p++;
            }
            while(n < len && a[n] >= 0) {
                n++;
            }
        }
        return cost;
    }
}


