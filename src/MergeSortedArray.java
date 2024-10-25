import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 4, 6};
        int m = 3;
        int[] nums2 = {2, 3, 7, 8};
        int n = 2;
        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            arrayList.add(nums1[i]);
        }
        for(int i = 0; i < n; i++) {
            arrayList.add(nums2[i]);
        }
        for(int i = 0; i < m + n; i++) {
            nums1[i] = arrayList.get(i);
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
