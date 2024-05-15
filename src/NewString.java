public class NewString {
    public static void main(String[] args) {
        System.out.println(newString("sun microsystems", 's'));

    }

    public static String newString(String string, char character) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != character) {
                stringBuilder.append(string.charAt(i));
            }

        }

        return stringBuilder.toString();
    }
}
