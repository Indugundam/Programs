import java.util.Arrays;

public class Cookies {
    public static void main(String[] args) {
    String string = "SEPESSPE";
    int noOfCookies = bakeCookies(string);
    System.out.println(noOfCookies);
    }

    public static int bakeCookies(String string) {
        int count = 0;
        int index = 0;
        while (index <= string.length() - 3) {
            char[] charArray = string.substring(index, index + 3).toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if (sortedString.equals("EPS")) {
                count++;
                index = index + 3;
            } else {
                index = index + 1;
            }
        }
        return count;
    }
}
