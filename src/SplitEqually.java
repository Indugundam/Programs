public class SplitEqually {
    public static void main(String[] args) {
        int[] weights = {1, 2, 4, 5, 1, 6}; //Index 3
        System.out.println(findSplitPoint(weights));
        int[] weights1 = {10, 20, 30, 20, 40, 50}; //Index -1
        System.out.println(findSplitPoint(weights1));
        int[] weights2 = {4, 10, 3, 7, 2, 5};//Index 2
        System.out.println(findSplitPoint(weights2));
        int[] weights3 = {8, 7, 6, 5, 4, 3, 3}; // Index 2
        System.out.println(findSplitPoint(weights3));
        int[] weights4 = {11, 22, 33, 44, 66}; // Index 3
        System.out.println(findSplitPoint(weights4));
        int[] weights5 = {5, 8, 12, 9, 25}; // Index 3
        System.out.println(findSplitPoint(weights5));
        int[] weights6 = {16, 5, 4, 9, 3}; // Index 1
        System.out.println(findSplitPoint(weights6));

    }

    public static int findSplitPoint(int[] weights) {
        int sum1 = 0;
        int sum2 = 0;
        int left = 0;
        int right = weights.length - 1;
        while (left < right) {
            if (sum1 <= sum2) {
                sum1 += weights[left];
                left++;
            } else {
                sum2 += weights[right];
                right--;
            }
        }
        if (sum1 == sum2 && left == right) {
            return left;
        }
        return -1;
    }
}
