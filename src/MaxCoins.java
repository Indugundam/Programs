public class MaxCoins {

    public static void main(String[] args) {
        int x = 1;
        maxCoins(x);
    }

    public static void maxCoins(int x) {
        int coins = 0;
        for(int i = 1; i <= x; i++) {
            coins = (int) (coins + Math.pow(2, i));
        }
        System.out.println(coins);
    }
}
