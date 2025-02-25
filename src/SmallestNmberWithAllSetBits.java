public class SmallestNmberWithAllSetBits {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(smallestNumber(n));
    }
    public static int smallestNumber(int n) {
//        int x = n;
//        for(int i = 0; i < 32; i++) {
//            if(((n >> i) & 1) == 0) {
//                n = setBits(n, i);
//            }
////            if(n >= x)
//        }
//        return x;
        int left = 2147483646;
        int right = 2147483647;
        int result = left;
        for(long i = (long) left + 1; i <= right; i++) {
            if(result == 0) return 0;
            result = result & (int)i;
        }
        return result;
    }


    public static int setBits(int n, int pos) {
        return  n | (1 << pos);
    }
}
