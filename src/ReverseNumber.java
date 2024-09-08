public class ReverseNumber {
        public static void main(String[] args) {
            int n = 123;
            if(n < 0) {
                System.out.print("-");
            }
            System.out.println(reverse(Math.abs(n)));
        }
        public static int reverse(int x) {
            StringBuilder string = new StringBuilder();
            while(x > 0) {
                int rem = x % 10;
                string.append(rem);
                x = x / 10;
            }
            int num = Integer.parseInt(string.toString());
            return num;
        }
    }
