public class DrawMountains {
    public static void main(String[] args) {
        int[] altitudes = { 0, 1, 1, 3, 3, 3, 2, 2, 4, 5, 4, 3, 2, 2, 1, 0};
        printMountains(altitudes);
    }

    private static void printMountains(int[] altitudes) {
        int maxAltitude = findMax(altitudes);
        String[][] array = new String[maxAltitude + 1][altitudes.length];
        for (int altitude = maxAltitude; altitude >= 0; altitude--) {
            for (int col = 0; col < altitudes.length; col++) {
                array[altitude][col] = " ";
                array[maxAltitude - altitudes[col]][col] = "*";
            }
        }

        for (int altitude = 0; altitude <= maxAltitude; altitude++) {
            for (int col = 0; col < altitudes.length; col++) {
                System.out.print(array[altitude][col]);
            }
            System.out.println();
        }
    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
}
}
