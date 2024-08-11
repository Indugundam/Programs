public class pyramid {
    public static void main(String[] args) {
        String string = "level";
        buildPyramid(string);
    }

    private static void buildPyramid(String string) {
        int midIndex = string.length() / 2;
        StringBuilder stringbuilder = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            System.out.print(" ".repeat((2 * string.length()) - 2 * i));
            stringbuilder.append(string.charAt((midIndex + i) % string.length()));
            System.out.println(stringbuilder.toString());
        }
    }
}
