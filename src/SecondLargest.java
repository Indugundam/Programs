import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SecondLargest {
    public static void main(String[] args) {
        String str = "dfa12321afd";
        System.out.println(secondHighest(str));
    }

    public static int secondHighest(String s) {
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                hashset.add(s.charAt(i) - '0');
            }
        }
        if (hashset.size() == 1) {
            return -1;
        }
        int[] array = new int[hashset.size()];
        int i = 0;
        for (int value : hashset) {
            array[i++] = value;
        }
        Arrays.sort(array);
        return array[1];
    }
}
