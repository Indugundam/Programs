import java.util.Scanner;
public class APlusBAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            int num = input.nextInt();
            int sum = 0;
            while(num > 0) {
                int rem = num % 10;
                sum += rem;
                num = num / 10;
            }
            System.out.println(sum);
        }
    }
}
