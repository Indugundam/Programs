import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        ArrayList<Integer> arrayList = intersection(nums1, nums2);
        for (int ele : arrayList) {
            System.out.println(ele);
        }
    }

    public static ArrayList<Integer> intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if ((nums1[i] == nums2[j] ) && !arrayList.contains(nums2[j])) {
                    arrayList.add(nums2[j]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        return arrayList;
    }
}
