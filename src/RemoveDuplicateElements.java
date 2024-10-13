public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
                count++;
            }
        }
        return count;
    }
}
