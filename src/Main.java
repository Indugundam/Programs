import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vector<Integer> ids = new Vector<>(n);
        Vector<Integer> costs = new Vector<>(n);

        for (int i = 0; i < n; i++) {
            ids.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            costs.add(sc.nextInt());
        }

        int budget = sc.nextInt();
        int mfi = 0, mfw = 0;

        for (int i = 0; i < n; i++) {
            int buyCost = costs.get(i);
            int maxQty = budget / buyCost;

            if (maxQty > 0) {
                int cfi = 0;
                int cfw = 0;

                for (int j = 0; j < n; j++) {
                    if (i != j && ids.get(i) % ids.get(j) == 0) {
                        cfi += maxQty;
                        cfw += costs.get(j) * maxQty;
                    }
                }

                if (cfi > mfi ||
                        (cfi == mfi && cfw > mfw)) {
                    mfi = cfi;
                    mfw = cfw;
                }
            }
        }

        System.out.println(mfi + " " + mfw);
        sc.close();
    }
}
