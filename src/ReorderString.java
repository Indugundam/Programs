import java.util.Arrays;

public class ReorderString {
    public static void main(String[] args) {
       String str = "aaaabbbbcccc";
       System.out.println(sortString(str));
    }
    public static String sortString(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(charArray);
        while(stringBuilder.length() < s.length()) {
            char prev = ' ';
            for (int i = 0; i < s.length(); i++) {
                if (charArray[i] != '0' && charArray[i] != prev) {
                    stringBuilder.append(charArray[i]);
                    charArray[i] = '0';
                }
                prev = charArray[i];
            }
            prev = ' ';
            System.out.println(stringBuilder.toString());
            for(int j = s.length() - 1; j > 0; j--) {
                if (charArray[j] != '0' && charArray[j] != prev) {
                    stringBuilder.append(charArray[j]);
                    charArray[j] = '0';
                }
                prev = charArray[j];
            }
        }
        return stringBuilder.toString();
    }
}
