import java.util.ArrayList;
import java.util.Stack;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        char[] result = new char[s.length()];
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = charArray[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                stack.push(ch);
            }
            else {
                result[i] = ch;
            }
        }
        for(int i = 0; i < result.length; i++) {
            if(result[i] == '\u0000') {
                result[i] = stack.pop();
            }
        }
        return new String(result);
    }
}
