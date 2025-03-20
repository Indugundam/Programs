import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha1Hash {
    public static void main(String[] args) {
        try {
            // Input text
            String text = "Information Technology";

            // Create MessageDigest instance for SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            // Compute the hash
            byte[] hashBytes = md.digest(text.getBytes());

            // Convert hash bytes to hexadecimal format
            StringBuilder hashHex = new StringBuilder();
            for (byte b : hashBytes) {
                hashHex.append(String.format("%02x", b));
            }

            // Print the SHA-1 hash
            System.out.println("SHA-1 Hash: " + hashHex.toString());

        } catch (NoSuchAlgorithmException e) {
            System.out.println("SHA-1 Algorithm not found: " + e.getMessage());
        }
    }
}
