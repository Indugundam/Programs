

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the 2x2 key matrix
        System.out.println("Enter the elements of the 2x2 key matrix:");
        int[][] keyMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                keyMatrix[i][j] = scanner.nextInt();
            }
        }

        // Ciphertext input
        System.out.print("Enter the ciphertext: ");
        String ciphertext = scanner.next().toUpperCase();
        System.out.println("Ciphertext: " + ciphertext);

        // Step 1: Compute the determinant of the key matrix
        int determinant = (keyMatrix[0][0] * keyMatrix[1][1] - keyMatrix[0][1] * keyMatrix[1][0]) % 26;
        if (determinant < 0) {
            determinant += 26; // Ensure positive determinant modulo 26
        }

        // Step 2: Compute the modular inverse of the determinant
        int determinantInverse = findModularInverse(determinant, 26);
        if (determinantInverse == -1) {
            System.out.println("Key matrix is not invertible modulo 26. Decryption is not possible.");
            return;
        }

        // Step 3: Compute the adjoint of the key matrix
        int[][] adjointMatrix = {
                {keyMatrix[1][1], -keyMatrix[0][1]},
                {-keyMatrix[1][0], keyMatrix[0][0]}
        };

        // Take modulo 26 for adjoint matrix elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                adjointMatrix[i][j] = (adjointMatrix[i][j] % 26 + 26) % 26;
            }
        }

        // Step 4: Compute the inverse key matrix modulo 26
        int[][] inverseKeyMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inverseKeyMatrix[i][j] = (adjointMatrix[i][j] * determinantInverse) % 26;
            }
        }

        // Step 5: Convert ciphertext to numerical values (A=0, B=1, ..., Z=25)
        int[] ciphertextNumbers = new int[ciphertext.length()];
        for (int i = 0; i < ciphertext.length(); i++) {
            ciphertextNumbers[i] = ciphertext.charAt(i) - 'A';
        }

        // Step 6: Decrypt ciphertext in pairs
        StringBuilder plaintext = new StringBuilder();
        for (int i = 0; i < ciphertextNumbers.length; i += 2) {
            int[] pair = {ciphertextNumbers[i], ciphertextNumbers[i + 1]};

            // Multiply inverse key matrix with the pair
            int[] decryptedPair = new int[2];
            decryptedPair[0] = (inverseKeyMatrix[0][0] * pair[0] + inverseKeyMatrix[0][1] * pair[1]) % 26;
            decryptedPair[1] = (inverseKeyMatrix[1][0] * pair[0] + inverseKeyMatrix[1][1] * pair[1]) % 26;

            // Convert decrypted numbers to letters and append to plaintext
            plaintext.append((char) (decryptedPair[0] + 'A'));
            plaintext.append((char) (decryptedPair[1] + 'A'));
        }

        // Print plaintext
        System.out.println("Decrypted Plaintext: " + plaintext.toString());
    }

    // Method to find modular inverse using Extended Euclidean Algorithm
    private static int findModularInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return -1; // No modular inverse exists
    }
}
