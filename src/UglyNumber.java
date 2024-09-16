import java.util.ArrayList;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(7));
    }

    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(5);
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if(n % i == 0 && isPrime(i)) {
                if(!arraylist.contains(i)) {
                    return false;
                }
                else {
                    count++;
                }
            }
        }
        if(count <= 3) {
            return true;
        }
        return false;
    }

    private static boolean isPrime(int i) {
        int count = 0;
        for(int j = 1; j <= i; j++) {
            if(i % j == 0) {
                count++;
            }
        }
        if(count == 2) {
            return true;
        }
        return false;
    }
}
