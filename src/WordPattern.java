import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hashMap = new HashMap<>();
        char[] charArray = pattern.toCharArray();
        String[] words = s.split(" ");
        if (charArray.length != words.length) {
            return false;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (!hashMap.containsKey(charArray[i])) {
                if (hashMap.containsValue(words[i])) {
                    return false;
                }
                hashMap.put(charArray[i], words[i]);
            } else {
                String str = hashMap.get(charArray[i]);
                if (!str.equals(words[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
