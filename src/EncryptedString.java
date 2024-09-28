public class EncryptedString {
    public static void main(String[] args) {
        int k = 3;
        String str = "dart";
        System.out.println(getEncryptedString(str, k));
    }
    public static String getEncryptedString(String s, int k) {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            string.append(s.charAt((i + k) % s.length()));
        }
        return string.toString();
    }
}
