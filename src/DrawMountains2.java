class DrawMountains2 {
    public static void main(String[] args) {
        int[] altitudes = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 5, 5, 5 , 4, 4, 3, 2, 2, 2, 1, 0};
        printMountain(altitudes);
    }

    public static void printMountain(int[] altitudes) {
        int left = findMax(altitudes, altitudes.length - 1);
        int right = left + 1;
        int spaces = 1;
        int count;
        System.out.print(" ".repeat(left));
        System.out.println("*");

        while (left >= 0 && right < altitudes.length) {
            int prev = left;
            left = findMax(altitudes, left - 1);
            System.out.print(" ".repeat(left));

            for (int k = left; k < prev; k++) {
                System.out.print("*");
            }

            int gap = prev - left;
            int value = altitudes[right];
            System.out.print(" ".repeat(spaces));
            count = 0;
            
            while (altitudes[right] == value) {
                System.out.print("*");
                right++;
                if (right >= altitudes.length) {
                    break;
                }
                count++;
            }
            spaces = gap + spaces + count;
            System.out.println("");
        }
    }

    public static int findMax(int[] array, int length) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i <= length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}
