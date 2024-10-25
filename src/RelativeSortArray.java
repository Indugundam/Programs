import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        HashSet<Integer> hashset = new HashSet<>();
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            hashset.add(arr2[i]);
        }
        for (int j = 0; j < arr1.length; j++) {
            if (!hashset.contains(arr1[j])) {
                arraylist.add(arr1[j]);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (hashmap.containsKey(arr1[i])) {
                int freq = hashmap.remove(arr1[i]);
                freq++;
                hashmap.put(arr1[i], freq);
            } else {
                hashmap.put(arr1[i], 1);
            }
        }
        int[] array = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int count = hashmap.remove(arr2[i]);
            for (int j = 0; j < count; j++) {
                array[k++] = arr2[i];
            }
        }
        int[] arr = new int[arraylist.size()];
        int i = 0;
        for (int ele : arraylist) {
            arr[i++] = ele;
        }
        Arrays.sort(arr);
        for(int ele : arr) {
            array[k++] = ele;
        }
        return array;
    }
}
