import java.util.Arrays;

public class PrintUnderline {
    public static void main(String[] args) {
        String string = "There is more treasure in the books than in all the pirates' loot on Treasure Island";
        printUnderline(string, "treasure");
    }
    private static void printUnderline(String string, String search) {
        char[] letters = new char[string.length()];
        int index = 0;
        String lowercaseString = string.toLowerCase();
        String lowercaseSearch = search.toLowerCase();
        Arrays.fill(letters, ' ');
        while (index != -1) {
            index = lowercaseString.indexOf(lowercaseSearch, index);
            if (index != -1) {
                for (int j = index; j < index + search.length(); j++) {
                    letters[j] = '-';
                }
                index += search.length();
            }
        }
        System.out.println(string);
        for (char letter : letters) {
            System.out.print(letter);
        }
    }
}
