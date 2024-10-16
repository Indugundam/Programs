public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(isHappy(num));
    }

    public static boolean isHappy(int n) {
        boolean isHappy = true;
        while (isHappy) {
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                sum += rem * rem;
            }
            System.out.println(sum);
            n = sum;
            if (sum == 1) {
                isHappy = false;
                return true;
            }
        }
        return false;
    }
}
