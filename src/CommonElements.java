import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 2};
        int[] array2 = {1, 2};
        System.out.println(Arrays.toString(findIntersectionValues(array1, array2)));
    }
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] count = new int[2];
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++) {
            set2.add(nums2[j]);
        }
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < nums1.length; i++) {
            if(set2.contains(nums1[i])) {
                count1++;
            }
        }
        for(int j = 0; j < nums2.length; j++) {
            if(set1.contains(nums2[j])) {
                count2++;
            }
        }
        count[0] = count1;
        count[1] = count2;
        return count;
    }
}
