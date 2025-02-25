public class MinimizeXOR {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 12;
        int n = 10;
        System.out.println(minimizeXor(num1, num2));
    }

    public static int minimizeXor(int num1, int num2) {

        int setBits2 = setBits(num2);
        return setbit(setBits2, num1);
    }

    public static int setBits(int n) {
        int setBits = 0;
        while (n != 0) {
            setBits++;
            n = n & (n - 1);
        }
        return setBits;
    }

    public static int setbit(int setbits, int n) {
        int x = 0;

        for (int i = 31; i >= 0 && setbits > 0; i--) {
            if (((n >> i) & 1) == 1) {
                x = x | (1 << i);
                setbits--;
            }
        }

        for (int i = 0; i < 32 && setbits > 0; i++) {
            if (((x >> i) & 1) == 0) {
                x = x | (1 << i);
                setbits--;
            }
        }

        return x;
    }
}
