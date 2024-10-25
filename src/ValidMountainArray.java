import java.util.HashSet;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 3, 5, 2, 1, 0};
        System.out.println(validMountainArray(array));
    }

    public static boolean validMountainArray(int[] arr) {
        int maxIndex = findMaxIndex(arr);
        HashSet<Integer> hashset = new HashSet<>();
        HashSet<Integer> hashset1 = new HashSet<>();
        for (int i = 0; i < maxIndex; i++) {
            if (hashset.contains(arr[i])) {
                return false;
            } else {
                if (arr[i] < arr[i + 1]) {
                    hashset.add(arr[i]);
                } else {
                    return false;
                }
            }
        }
        for (int i = maxIndex + 1; i < arr.length - 1; i++) {
            if (hashset1.contains(arr[i])) {
                return false;
            } else {
                if (arr[i] > arr[i + 1]) {
                    hashset.add(arr[i]);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findMaxIndex(int[] array) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
