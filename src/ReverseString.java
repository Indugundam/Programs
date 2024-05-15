public class ReverseString {
    public static void main(String[] args) {
        String string = "Java is invented by Sun Microsystems";
        System.out.println(reverseOfWords(string));
    }

    public static String reverseOfWords(String string) {
        String words[] = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i] + " ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }
}