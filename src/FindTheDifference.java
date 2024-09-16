import java.util.HashSet;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "eabd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
    public static char findTheDifference(String s, String t) {
        HashSet<Character> hashset = new HashSet<>();
        HashSet<Character> hashset1 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hashset.add(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++) {
            hashset1.add(t.charAt(i));
        }
        System.out.println(hashset);
        System.out.println(hashset1);
        
        for (Character ch : hashset) {

        }
        return ' ';
    }
}
