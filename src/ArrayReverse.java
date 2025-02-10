import java.util.Arrays;
import java.util.Stack;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 2, 6, 5};
        System.out.println(Arrays.toString(arrayReverse(array)));
    }
    public static int[] arrayReverse(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int ele : arr) {
            stack.push(ele);
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}
