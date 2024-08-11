import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] array = {9, 9, 9, 9, 9, 9};
        int[] resultedArray = plusOne(array);
            System.out.println(Arrays.toString(resultedArray));
    }
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for(int  i = digits.length - 1; i > 0; i--) {
            if(digits[i] > 9) {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }
        int length = 0;
        if(digits[0] > 9) {
            length = digits.length + 1;
        }
        else {
            length = digits.length;
        }
        int[] resultedArray = new int[length];
        if(digits[0] > 9) {
            resultedArray[0] = 1;
            resultedArray[1] = 0;
            for(int  i = 2 ; i < length; i++) {
                resultedArray[i] = digits[i - 1];
            }
        }
        else {
            for(int  i = 0 ; i < length; i++) {
                resultedArray[i] = digits[i];
            }
        }

        return resultedArray;
    }
}