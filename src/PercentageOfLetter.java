import java.util.HashMap;

public class PercentageOfLetter {
    public static void main(String[] args) {
        String str = "footer";
        char letter = 'o';
        System.out.println(percentageLetter(str, letter));
    }
    public static int percentageLetter(String s, char letter) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashmap.containsKey(s.charAt(i))) {
                int frequency = hashmap.remove(s.charAt(i));
                frequency++;
                hashmap.put(s.charAt(i), frequency);
            } else {
                hashmap.put(s.charAt(i), 1);
            }
        }
        int per = 0;
        for (char ch : hashmap.keySet()) {
            if (ch == letter) {
                System.out.println(hashmap.get(ch));
                per = (hashmap.get(ch) * 100)/ s.length();
                System.out.println(per);
            }
        }
        return per;
    }
}
