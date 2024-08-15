public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5, 4},
                {7, 3, 2},
                {3, 5, 9}
        };
        System.out.println("Maximum wealth is " + maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int maximumWealth = Integer.MIN_VALUE;
        for(int row = 0; row < accounts.length; row++) {
            int wealth = 0;
            for(int col = 0; col < accounts[row].length; col++) {
                wealth += accounts[row][col];
            }
            if(wealth > maximumWealth) {
                maximumWealth = wealth;
            }
        }
        return maximumWealth;
    }
}
