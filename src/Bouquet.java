import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bouquet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for(int i = 0; i < cases; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            int total = 0;
            for(int j = 0; j < n; j++) {
                Integer[] petals = new Integer[n];
                for(int k = 0; k < n; k++) {
                    petals[k] = input.nextInt();
                }
                Arrays.sort(petals, Collections.reverseOrder());
                for(int p = 0; p < n - 1; p++) {
                    if(total <= m && (petals[i] - petals[i + 1] <= 1)) {
                        total = Math.max(petals[p], total + petals[p]);
                    }
                }
                System.out.println(total);
            }
        }
    }
}



