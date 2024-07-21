public class YZswapper {
    public static void main(String[] args) {
        String string = "ZanxthoXzl";
        printSwappedYZ(string);
    }

    private static void printSwappedYZ(String string) {
        char[] letters = string.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'y') {
                letters[i] = 'z';
            } else if (letters[i] == 'Y') {
                letters[i] = 'Z';
            } else if (letters[i] == 'z') {
                letters[i] = 'y';
            } else if (letters[i] == 'Z') {
                letters[i] = 'Y';
            }
        }
        String swappedString = new String(letters);
        System.out.println(swappedString);
    }
}
