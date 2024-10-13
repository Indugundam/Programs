public class FindJudge {
    public static void main(String[] args) {
        int[][] trust = {
                {1, 3},
                {2, 3},
                {3, 1}
        };
        int n = 3;
        System.out.println(findJudge(n, trust));
    }

    public static int findJudge(int n, int[][] trust) {
        for (int i = 0; i < trust.length; i++) {
            int k = trust[i][1];
            int count = 1;
            for (int j = 1; j < trust.length; j++) {
                if (trust[j][1] == k) {
                    count++;
                    if (count == n - 1) {
                        return k;
                    }
                }
                if (trust[0][i] == k) {
                    return -1;
                }
            }
        }
        return -1;
    }
}
