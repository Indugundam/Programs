import java.util.ArrayList;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }

        public static boolean isUgly(int n) {
        if(n <= 0) {
            return false;
        }
            ArrayList<Integer> arraylist = new ArrayList<>();
            arraylist.add(2);
            arraylist.add(3);
            arraylist.add(5);
            for(int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    if(isPrime(i) && !arraylist.contains(i)) {
                        return false;
                    }
                }
            }
            return true;
        }

    private static boolean isPrime(int n) {
        int count = 0;
        for(int j = 1; j <= n / 2; j++) {
            if(n % j == 0) {
                count++;
            }
        }
        if(count == 1) {
            return true;
        }
        return false;
    }
}
