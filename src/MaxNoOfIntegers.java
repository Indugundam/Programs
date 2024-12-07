import java.util.HashSet;

public class MaxNoOfIntegers {

    public static void main(String[] args) {
        int[] banned = {1,2,3,4,5,6,7};
        int n = 8;
        int maxSum = 1;
        System.out.println(maxCount(banned, n, maxSum));
    }

    public static int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < banned.length; i++) {
            hashSet.add(banned[i]);
        }
        int sum = 0;
        int sum1 = 0;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(!hashSet.contains(i)) {
                sum1 += i;
                if(sum1 <= maxSum) {
                    sum = sum1;
                    count += 1;
                }
            }
        }
        return count;
    }
}
