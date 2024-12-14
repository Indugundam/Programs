import java.util.Arrays;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String  licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};
        System.out.println(shortestCompletingWord(licensePlate, words));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < licensePlate.length(); i++) {
            if(licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z') {
                string.append(licensePlate.charAt(i));
            }
            else if(licensePlate.charAt(i) >= 'A' && licensePlate.charAt(i) <= 'Z') {
                char ch = (char)(licensePlate.charAt(i) + 32);
                string.append(ch);
            }
        }
        char[] charArray = string.toString().toCharArray();
        Arrays.sort(charArray);
        String str = new String(charArray);

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] array = words[i].toCharArray();
            Arrays.sort(array);
            String s = new String(array);
            if(s.contains(str)) {
                return word;
            }
        }
    return null;
    }
}
