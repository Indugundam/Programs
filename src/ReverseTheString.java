import java.util.Arrays;

public class ReverseTheString {
    public static void main(String[] args) {
        char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
