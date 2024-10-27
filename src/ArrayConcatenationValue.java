public class ArrayConcatenationValue {
    public static void main(String[] args) {
        int[] array = {7,52,2,4};
        System.out.println(findTheArrayConcVal(array));
    }
    public static long findTheArrayConcVal(int[] nums) {
        long value = 0;
        int i = 0;
        int j = nums.length - 1;
        String concat = "";
        while(i < j) {
            concat = nums[i] + "" + nums[j];
            value += Integer.parseInt(concat);
            i++;
            j--;
        }
        if(i == j) {
            value += nums[i];
        }
        return value;
    }
}
