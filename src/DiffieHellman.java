import java.math.BigInteger;

public class DiffieHellman {
    public static void main(String[] args) {
        // Given values
        int q = 353; // Prime number
        int alpha = 3; // Primitive root
        int X_A = 97; // Alice's private key
        int X_B = 233; // Bob's private key

        // Calculate public keys
        BigInteger Y_A = BigInteger.valueOf(alpha).modPow(BigInteger.valueOf(X_A), BigInteger.valueOf(q));
        BigInteger Y_B = BigInteger.valueOf(alpha).modPow(BigInteger.valueOf(X_B), BigInteger.valueOf(q));

        System.out.println("Alice's Public Key (Y_A): " + Y_A);
        System.out.println("Bob's Public Key (Y_B): " + Y_B);

        // Compute shared secret key
        BigInteger K_A = Y_B.modPow(BigInteger.valueOf(X_A), BigInteger.valueOf(q)); // Alice computes
        BigInteger K_B = Y_A.modPow(BigInteger.valueOf(X_B), BigInteger.valueOf(q)); // Bob computes

        System.out.println("Alice's Computed Shared Secret Key: " + K_A);
        System.out.println("Bob's Computed Shared Secret Key: " + K_B);

        // Both keys should be the same
        if (K_A.equals(K_B)) {
            System.out.println("Key Exchange Successful! Shared Secret Key: " + K_A);
        } else {
            System.out.println("Key Exchange Failed!");
        }
    }
}
