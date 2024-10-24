import java.util.HashMap;

public class Merge2DArrays {
    public static void main(String[] args) {
        int[][] nums1 = {
                {1, 2},
                {2, 3},
                {4, 5}
        };
        int[][] nums2 = {
                {1, 4},
                {3, 2},
                {4, 1}
        };
        int[][] result = mergeArrays(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (hashmap.containsKey(nums1[i][0])) {
                int sum = hashmap.remove(nums1[i][0]);
                sum += nums1[i][1];
                hashmap.put(nums1[i][0], sum);
            } else {
                hashmap.put(nums1[i][0], nums1[i][1]);
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            if (hashmap.containsKey(nums2[j][0])) {
                int sum = hashmap.remove(nums2[j][0]);
                sum += nums2[j][1];
                hashmap.put(nums2[j][0], sum);
            } else {
                hashmap.put(nums2[j][0], nums2[j][1]);
            }
        }
        int[] array = new int[hashmap.size()];
        int i = 0;
        for (Integer key : hashmap.keySet()) {
            array[i] = key;
            i++;
        }
        int[][] finalMatrix = new int[hashmap.size()][2];
        int k = 0;
        for (Integer key : hashmap.keySet()) {
            int minKey = findMin(key, array);
            finalMatrix[k][0] = minKey;
            finalMatrix[k][1] = hashmap.get(minKey);
            k++;
        }
        return finalMatrix;
    }
    public static int findMin(int key, int[] array) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        array[minIndex] = Integer.MAX_VALUE;
        return min;
    }
}
