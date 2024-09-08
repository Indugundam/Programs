public class Power {
    public static void main(String[] args) {
        int n = 0;
        int x = 2;
        double result = myPow(x, n);
        System.out.println(result);
    }
    public static double myPow(double x, int n) {
            double result = 1;
            int p = Math.abs(n);
            for(int i = 1; i <= p; i++) {
                result = result * x;
            }
            if(n < 0) {
                result = 1 / result;
            }
            else if(n == 0) {
                result = 1.0000;
            }
            return result;
        }
}
