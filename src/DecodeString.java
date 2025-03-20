import java.util.Arrays;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[ab]12[c]";
        System.out.println(decodeString(s)); // Output: accaccacc
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // Forming multi-digit numbers
            } else if (ch == '[') {
                countStack.push(num);  // Store the multiplier
                stringStack.push(result); // Store the previous result
                result = new StringBuilder(); // Start new substring
                num = 0; // Reset number
            } else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder temp = stringStack.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(result);
                }
                result = temp;
            } else {
                result.append(ch); // Append character to the current result
            }
        }
        return result.toString();
    }
}
