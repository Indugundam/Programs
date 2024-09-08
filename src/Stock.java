public class Stock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length - 1; i++) {
            int profit = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    profit = prices[j] - prices[i];
                }
                if (profit > maxProfit) {
                maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
