import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        minimumLegs();
    }
    public static void minimumLegs() {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        for(int i = 0; i < tc; i++) {
            int n = input.nextInt();
            int count = 0;
            while (n > 0) {
                if (n >= 4) {
                    n = n - 4;
                    count++;
                } else {
                    n = n - 2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
