import java.util.Scanner;
public class SDESEncryption {
    private static final int[] P10 = {3, 5, 2, 7, 4, 10, 1, 9, 8, 6};
    private static final int[] P8 = {6, 3, 7, 4, 8, 5, 10, 9};
    private static final int[] IP = {2, 6, 3, 1, 4, 8, 5, 7};
    private static final int[] IP_INV = {4, 1, 3, 5, 7, 2, 8, 6};
    private static final int[] EP = {4, 1, 2, 3, 2, 3, 4, 1};
    // S-Boxes
    private static final int[][] S0 = {
            {1, 0, 3, 2},
            {3, 2, 1, 0},
            {0, 2, 1, 3},
            {3, 1, 3, 2}
    };
    private static final int[][] S1 = {
            {0, 1, 2, 3},
            {2, 0, 1, 3},
            {3, 0, 1, 0},
            {2, 1, 0, 3}
    };

    // P4 permutation table
    private static final int[] P4 = {2, 4, 3, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get key and plaintext input
        System.out.print("Enter a 10-bit key: ");
        String key = scanner.next();
        System.out.print("Enter an 8-bit plaintext: ");
        String plaintext = scanner.next();

        // Generate subkeys
        String[] subkeys = generateSubkeys(key);

        // Perform encryption
        String ciphertext = encrypt(plaintext, subkeys);

        // Output the result
        System.out.println("Ciphertext: " + ciphertext);
    }

    private static String encrypt(String plaintext, String[] subkeys) {
        // Initial permutation
        String permutedText = permute(plaintext, IP);

        // Split into left and right
        String left = permutedText.substring(0, 4);
        String right = permutedText.substring(4);

        // Round 1
        String result = feistel(left, right, subkeys[0]);

        // Swap
        String swapped = result.substring(4) + result.substring(0, 4);

        // Round 2
        String finalResult = feistel(swapped.substring(0, 4), swapped.substring(4), subkeys[1]);

        // Inverse initial permutation
        return permute(finalResult, IP_INV);
    }

    private static String feistel(String left, String right, String subkey) {
        String expandedRight = permute(right, EP);
        String xorResult = xor(expandedRight, subkey);
        String sboxOutput = sbox(xorResult.substring(0, 4), S0) + sbox(xorResult.substring(4), S1);
        String p4Result = permute(sboxOutput, P4);
        String newLeft = xor(left, p4Result);
        return newLeft + right;
    }

    private static String[] generateSubkeys(String key) {
        // P10 permutation
        String permutedKey = permute(key, P10);

        // Split and perform LS-1
        String left = shiftLeft(permutedKey.substring(0, 5), 1);
        String right = shiftLeft(permutedKey.substring(5), 1);

        // Generate K1
        String k1 = permute(left + right, P8);

        // Perform LS-2
        left = shiftLeft(left, 2);
        right = shiftLeft(right, 2);

        // Generate K2
        String k2 = permute(left + right, P8);

        return new String[]{k1, k2};
    }

    private static String shiftLeft(String input, int shifts) {
        return input.substring(shifts) + input.substring(0, shifts);
    }

    private static String permute(String input, int[] table) {
        StringBuilder result = new StringBuilder();
        for (int position : table) {
            result.append(input.charAt(position - 1));
        }
        return result.toString();
    }

    private static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return result.toString();
    }

    private static String sbox(String input, int[][] sbox) {
        int row = Integer.parseInt("" + input.charAt(0) + input.charAt(3), 2);
        int col = Integer.parseInt("" + input.charAt(1) + input.charAt(2), 2);
        int value = sbox[row][col];
        return String.format("%2s", Integer.toBinaryString(value)).replace(' ', '0');
    }
}


