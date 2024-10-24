public class DistanceValue {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 8};
        int[] nums2 = {10, 9, 1, 8};
        int d = 2;
        System.out.println(findTheDistanceValue(nums1, nums2, d));
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = arr1.length;
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(Math.abs(arr1[i] - arr2[j]) <= d) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
