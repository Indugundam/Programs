import java.util.ArrayList;

public class FormSmallestNumber {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 3};
        int[] nums2 = {5, 7};
        System.out.println(minNumber(nums1, nums2));
    }
    public static int minNumber(int[] nums1, int[] nums2) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            arraylist.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++) {
            if(arraylist.contains(nums2[j])) {
                min.add(nums2[j]);
            }
        }
        int minimum = Integer.MAX_VALUE;
        if(min.size() > 0) {
            for (int ele : min) {
                if (ele < minimum) {
                    minimum = ele;
                }
            }
            return minimum;
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] < min1) {
                min1 = nums1[i];
            }
        }
        for(int j = 0; j < nums2.length; j++) {
            if(nums2[j] < min2) {
                min2 = nums2[j];
            }
        }
        return (min1 < min2 ? min1 : min2) * 10 + (min2 > min1 ? min2 : min1);

    }
}
