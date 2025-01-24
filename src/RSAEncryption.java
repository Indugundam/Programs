import java.math.BigInteger;

public class RSAEncryption {

    public static void main(String[] args) {
        // Given parameters
        int plaintext = 5;
        int p = 3;
        int q = 13;
        int e = 5;

        // Calculate n and φ(n)
        int n = p * q; // n = p * q
        int phi = (p - 1) * (q - 1); // φ(n) = (p - 1) * (q - 1)

        // Ensure e is valid (e must be 1 < e < φ(n) and gcd(e, φ(n)) = 1)
        if (gcd(e, phi) != 1) {
            System.out.println("Invalid value for e. e must be coprime with φ(n).");
            return;
        }

        // Encryption: C = (P^e) mod n
        BigInteger P = BigInteger.valueOf(plaintext);
        BigInteger E = BigInteger.valueOf(e);
        BigInteger N = BigInteger.valueOf(n);

        BigInteger C = P.modPow(E, N); // Compute C = (P^e) mod n

        // Output results
        System.out.println("Public Key (e, n): (" + e + ", " + n + ")");
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + C);
    }

    // Helper method to calculate gcd
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
