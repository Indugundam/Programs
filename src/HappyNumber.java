import java.util.ArrayList;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(isHappy(num));
    }

    public static boolean isHappy(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean isHappy = true;
        while (isHappy) {
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                sum += rem * rem;
            }
            if (arrayList.contains(sum)) {
                return false;
            } else {
                arrayList.add(sum);
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
