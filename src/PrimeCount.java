public class PrimeCount {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(countPrime(num));
    }

    private static int countPrime(int num) {
        int count = 0;
        for(int i = 2; i < num; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
