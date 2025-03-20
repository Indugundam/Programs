public class Practice {
    public static void main(String[] args) {
        int a = 20;
        int b = 12;
        System.out.println(multiply(a, b));
    }
    public static int multiply(int a, int b) {
        int ans = 0;
        if(a == 0) return 0;
        while(b != 0) {
            if((b & 1) == 1) {
                ans += a;
            }
            a = a << 1;
            b = b >> 1;
        }
        return ans;
    }
}
