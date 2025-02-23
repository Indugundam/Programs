public class AllSetBits {
    public static void main(String[] args) {
        int num = 5;
        smallestNumber(num);
    }
    public static void smallestNumber(int n) {
        for(int i = 7; i >= 0; i--) {
            System.out.print((n >> i) & 1);
        }
    }
}
