import java.util.Scanner;

public class CaeserEncryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int rotation = input.nextInt();
        String string = "abc.xyz!";
        String encryptedString = encrypt(string, rotation);
        System.out.println(encryptedString);
        String decryptedString = decrypt(encrypt(string, rotation), rotation);
        System.out.println(decryptedString);
    }

    public static String encrypt(String string, int rotation) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                stringBuilder.append((char)(((string.charAt(i) - 'a') + rotation ) % 26 + 'a'));
            } else {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String decrypt(String string, int rotation) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                stringBuilder.append((char) (((string.charAt(i) - 'z') - rotation) % 26 + 'z'));
            } else {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }c
}
