//import java.util.Scanner;
//
//public class CaeserEncryption {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int rotation = input.nextInt();
//        String string = "indugundam";
//        String encryptedString = encrypt(string, rotation);
//        System.out.println(encryptedString);
//        String decryptedString = decrypt(encrypt(string, rotation), rotation);
//        System.out.println(decryptedString);
//    }
//
//    public static String encrypt(String string, int rotation) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
//                stringBuilder.append((char)(((string.charAt(i) - 'a') + rotation ) % 26 + 'a'));
//            } else {
//                stringBuilder.append(string.charAt(i));
//            }
//        }
//        return stringBuilder.toString();
//    }
//
//    public static String decrypt(String string, int rotation) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
//                stringBuilder.append((char) (((string.charAt(i) - 'z') - rotation) % 26 + 'z'));
//            } else {
//                stringBuilder.append(string.charAt(i));
//            }
//        }
//        return stringBuilder.toString();
//    }
//}
import java.util.Scanner;
public class CaeserEncryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = input.nextInt();
        System.out.println("Enter the Plain text : ");
        String string = input.next();
        String encryptedString = encrypt(string, key);
        System.out.println("Cipher Text : " + encryptedString);
        decrypt(encrypt(string, key));
    }

    public static String encrypt(String string, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                stringBuilder.append((char)(((string.charAt(i) - 'a') + key ) % 26 + 'a'));
            }
            else if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                stringBuilder.append((char)(((string.charAt(i) - 'A') + key ) % 26 + 'A'));
            }
            else {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void decrypt(String string) {
        for(int i = 0; i < 26; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) >= 'a' && string.charAt(j) <= 'z') {
                    stringBuilder.append((char) (((string.charAt(j) - 'z') - i) % 26 + 'z'));
                }
                else if(string.charAt(j) >= 'A' && string.charAt(j) <= 'Z') {
                    stringBuilder.append((char) (((string.charAt(j) - 'Z') - i) % 26 + 'Z'));
                }else {
                    stringBuilder.append(string.charAt(j));
                }
            }
            System.out.println("key #" + i + " : " + stringBuilder.toString());
        }
    }
}
