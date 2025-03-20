public class PrintPattern {
    public static void main(String[] args) {
        int n = 5;
//        printPattern(n);
        isHappy(68);
    }
    public static void printPattern(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            for(int j = 1; j < i; j++) {
                if(j % 2 == 0) {
                    System.out.print((n + 1) + i * (2 * j) + " ");
                }
                else {
                    System.out.print((n + 1) + i + j + " ");
                }
            }
            System.out.println();
        }
    }
    public static void isHappy(int n) {
        int sum = 0;
        int sqsum = 0;
        int x = n;
        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            sqsum += Math.sqrt(rem);
            n = n / 10;
        }
        if(sum % 10 == 0 || sqsum % 10 == 0) {
            System.out.println(x + " is happy");
        }
        else {
            System.out.println(x + " is not happy");
        }
    }
}
