import java.util.Arrays;

public class RearrangeStrings {
    public static void main(String[] args) {
        String s = "aabbcc";
        String t = "bbccaa";
        int k = 2;
        System.out.println(isPossibleToRearrange(s, t, k));
    }

    public static boolean isPossibleToRearrange(String s, String t, int k) {
        String str1 = "Java Developer";
        String str2 = "java developer";
        str1.toLowerCase();
        str2.toLowerCase();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));
        int n = s.length() / k;
        String[] words = new String[n];
        int index = 0;
        for (int i = 0; i < s.length(); i += 2) {
            StringBuilder str = new StringBuilder();
            str.append(s.charAt(i));
            str.append(s.charAt(i + 1));
            words[index] = str.toString();
            index++;
        }
        for (String word : words) {
            System.out.println(word);
        }

        permutations(words, 0, k, t);

        return false;
    }

    public static void swap(String[] words, int i, int j) {
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
    }

    public static void permutations(String[] words, int index, int k, String t) {
        if (index == words.length * k) {
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < words.length; i++) {
                str.append(words[i]);
            }
            if(str.toString().equals(t)) {
                
            }
        }

        for (int i = index; i < words.length; i++) {
            swap(words, index, i);
            permutations(words, index + 1, k, t);
            swap(words, index, i);
        }
    }

}
