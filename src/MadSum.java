import java.util.Scanner;
public class MadSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int sum = 0;
            int length = sc.nextInt();
            int[] array = new int[]{sc.nextInt()};
            for(int j = 0; j < length; j++) {
                sum += array[j];

            }

        }
    }
}
