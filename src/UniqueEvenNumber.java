public class UniqueEvenNumber {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        System.out.println("Total unique even numbers: " + totalNumbers(a));
    }

    public static int totalNumbers(int[] digits) {
        int n = digits.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    if (digits[k] % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
