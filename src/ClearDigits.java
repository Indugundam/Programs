import java.util.Stack;

public class ClearDigits {
    public static void main(String[] args) {
        String s = "cdab34";
        System.out.println(clearDigits(s));
    }
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                stack.pop();            }
            else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder string = new StringBuilder();
        while(!stack.isEmpty()) {
            string.append(stack.pop());
        }
        return string.reverse().toString();
    }
}
