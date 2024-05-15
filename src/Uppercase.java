public class Uppercase {
    public static void main(String[] args) {
        String string = "sun rises in the east!";
        System.out.println(toUppercase(string));
    }

    public static String toUppercase(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                stringBuilder.append((char) (string.charAt(i) - 32));
            } else {
                stringBuilder.append(string.charAt(i));
            }

        }

        return stringBuilder.toString();
    }
}
