import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(', '[', '{': {
                    stack.push(s.charAt(i));
                    break;
                }
                case ')': {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                }
                case ']': {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                }
                case '}': {
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
