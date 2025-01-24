import java.math.BigInteger;

public class RSADecryption {

    public static void main(String[] args) {
        // Given parameters
        int p = 3;
        int q = 13;
        int e = 3;
        int ciphertext = 14; // Ciphertext to decrypt

        // Calculate n and φ(n)
        int n = p * q; // n = p * q
        int phi = (p - 1) * (q - 1); // φ(n) = (p - 1) * (q - 1)

        // Calculate the private key d (modular multiplicative inverse of e mod φ(n))
        int d = modInverse(e, phi);
        if(d == -1) {
            System.out.println("Doesn't exist");
            return;
        }
        // Decryption: P = (C^d) mod n
        BigInteger C = BigInteger.valueOf(ciphertext);
        BigInteger D = BigInteger.valueOf(d);
        BigInteger N = BigInteger.valueOf(n);

        BigInteger plaintext = C.modPow(D, N); // Compute P = (C^d) mod n

        // Output results
        System.out.println("Public Key (e, n): (" + e + ", " + n + ")");
        System.out.println("Private Key (d): " + d);
        System.out.println("Ciphertext: " + ciphertext);
        System.out.println("Decrypted Plaintext: " + plaintext);
    }

    // Method to calculate the modular multiplicative inverse
    private static int modInverse(int a, int m) {
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return -1;
    }
}
