import java.util.ArrayList;
import java.util.List;

public class DifferenceOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> list = findDifference(nums1, nums2);
        for(List l : list) {
            System.out.println(l);
        }
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++) {
            list2.add(nums2[j]);
        }
        System.out.println(list1);
        System.out.println(list2);
        for(int i = 0; i < nums1.length; i++) {
            if(!list2.contains(nums1[i]) && !list3.contains(nums1[i])) {
                list3.add(nums1[i]);
            }
        }
        for(int j = 0; j < nums2.length; j++) {
            if(!list1.contains(nums2[j]) && !list4.contains(nums2[j])) {
                list4.add(nums2[j]);
            }
        }
        list.add(list3);
        list.add(list4);
        return list;
    }
}
