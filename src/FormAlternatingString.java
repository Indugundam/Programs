import java.util.Scanner;

public class FormAlternatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int res = 0;
        char lastChar = s.charAt(0);
        int lastWorth = v[0];

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == lastChar) {
                res += Math.min(lastWorth, v[i]);
                lastWorth = Math.max(lastWorth, v[i]);
            } else {
                lastChar = s.charAt(i);
                lastWorth = v[i];
            }
        }

        System.out.println(res);
    }
}
