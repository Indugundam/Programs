import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {
       int[] candies = {2, 3, 5, 1, 3};
       int extraCandies = 2;
       boolean[] flags = hasGreatestNoOfCandies(candies, extraCandies);
           System.out.println(Arrays.toString(flags));
    }

    public static boolean[] hasGreatestNoOfCandies(int[] candies, int extraCandies) {
        boolean[] flags = new boolean[candies.length];
        for(int i = 0; i < candies.length; i++) {
            flags[i] = isGreater(candies[i] + extraCandies, candies);
        }
        return flags;
    }

    public static boolean isGreater(int value, int[] candies) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++) {
            if(value < candies[i]) {
                return false;
            }
        }
        return true;
    }
}
