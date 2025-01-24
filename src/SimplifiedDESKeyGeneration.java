import java.util.Scanner;

public class SimplifiedDESKeyGeneration {
    private static int[] P10 = {3, 5, 2, 7, 4, 10, 1, 9, 8, 6};
    private static int[] P8 = {6, 3, 7, 4, 8, 5, 10, 9};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 10-bit key (e.g., 1010000010): ");
        String key = scanner.nextLine();
        String[] subkeys = generateSubkeys(key);
        System.out.println("Subkey 1: " + subkeys[0]);
        System.out.println("Subkey 2: " + subkeys[1]);
    }
    public static String permute(String key, int[] permTable) {
        StringBuilder permutedKey = new StringBuilder();
        for (int position : permTable) {
            permutedKey.append(key.charAt(position - 1));
        }
        return permutedKey.toString();
    }
    public static String leftShift(String key, int shifts) {
        return key.substring(shifts) + key.substring(0, shifts);
    }
    public static String[] generateSubkeys(String key) {
        String p10Key = permute(key, P10);
        String left = p10Key.substring(0, 5);
        String right = p10Key.substring(5);
        String left1 = leftShift(left, 1);
        String right1 = leftShift(right, 1);
        String combined1 = left1 + right1;
        String subkey1 = permute(combined1, P8);
        String left2 = leftShift(left1, 2);
        String right2 = leftShift(right1, 2);
        String combined2 = left2 + right2;
        String subkey2 = permute(combined2, P8);
        return new String[]{subkey1, subkey2};
    }
}
