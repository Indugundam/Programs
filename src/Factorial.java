import java.util.ArrayList;
import java.util.Stack;

public class Factorial {
    static String str;
    public static void main(String[] args) {
        int n = 8;
        String s;
//        System.out.println(str);
//        System.out.println(s);

        int meal = 5;
        int tip = 2;
        int total = meal + (meal>6 ? ++tip : tip);
        int abc = tip--;
//        System.out.println(tip); //1
//        System.out.println(abc); //2
//        System.out.println(factorial(n));

    }
    public static ArrayList<Integer> factorial(int n) {
        // code here
        long num = fact(n);
        System.out.println(num);
        Stack<Integer> stack = new Stack<>();

        ArrayList<Integer> arr = new ArrayList<>();

        while(num > 0) {
            int rem =(int) num % 10;
            stack.push(rem);
            num = num / 10;
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
            arr.add(stack.pop());
        }
        return arr;
    }

    public static long fact(int n) {

        if(n == 0) return 1;

        return n * fact(n - 1);
    }
}
