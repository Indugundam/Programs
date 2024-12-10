import java.util.HashMap;

public class PalindromePermutation {

    public static void main(String[] args) {
        String string = "Tact Coa";
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String str) {
        String str1 = str.toLowerCase();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                string.append(str1.charAt(i));
            }
        }
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (hashmap.containsKey(string.charAt(i))) {
                int freq = hashmap.get(string.charAt(i));
                freq++;
                hashmap.put(string.charAt(i), freq);
            } else {
                hashmap.put(string.charAt(i), 1);
            }
        }
        int count = 0;
        for (char letter : hashmap.keySet()) {
            System.out.println(letter + " " + hashmap.get(letter));
            if (hashmap.get(letter) % 2 != 0) {
                count++;
            }
        }
        if (string.length() % 2 == 0) {
            if (count == 0) return true;
            else return false;
        } else {
            if (count == 0) return false;
            else return true;
        }
    }
}
