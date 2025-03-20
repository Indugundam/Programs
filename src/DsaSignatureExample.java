import java.math.BigInteger;
import java.security.SecureRandom;

public class DsaSignatureExample {
    // Small prime numbers for demonstration
    private static final BigInteger p = new BigInteger("61");  // Prime number
    private static final BigInteger q = new BigInteger("13");  // Smaller prime divisor of (p-1)
    private static final BigInteger g = new BigInteger("2");   // Generator

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        // Private Key (x) - Random value less than q
        BigInteger x = new BigInteger("5");  // Choosing a small private key

        // Public Key (y = g^x mod p)
        BigInteger y = g.modPow(x, p);

        // Message to be signed (Converting String to Number)
        String message = "GVP";
        BigInteger messageNumeric = stringToBigInteger(message);

        // Signature Generation
        BigInteger k, r, s;
        do {
            k = new BigInteger("7"); // Random k (should be less than q)
            r = g.modPow(k, p).mod(q);
            s = k.modInverse(q).multiply(messageNumeric.add(x.multiply(r))).mod(q);
        } while (r.equals(BigInteger.ZERO) || s.equals(BigInteger.ZERO));

        System.out.println("Signature: (r=" + r + ", s=" + s + ")");

        // Signature Verification
        BigInteger w = s.modInverse(q);
        BigInteger u1 = messageNumeric.multiply(w).mod(q);
        BigInteger u2 = r.multiply(w).mod(q);
        BigInteger v = (g.modPow(u1, p).multiply(y.modPow(u2, p)).mod(p)).mod(q);

        System.out.println("Verification Result: " + v.equals(r));
    }

    // Function to convert a string into a BigInteger (Using ASCII values)
    private static BigInteger stringToBigInteger(String text) {
        StringBuilder str = new StringBuilder();
        for (char c : text.toCharArray()) {
            str.append((int) c); // Convert each char to ASCII and append
        }
        return new BigInteger(str.toString());
    }
}
