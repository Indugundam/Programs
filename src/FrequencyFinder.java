import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class FrequencyFinder {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String string = input.nextLine();
    HashMap<String, Integer> hashmap = FrequencyOfWords(string);
    System.out.println(hashmap);
    boolean flag = hasDuplicates(string);
    if(flag) {
        System.out.println("Given string contains duplicate words");
    }
    else {
        System.out.println("Given string doesn't contain duplicate words");
    }
}

    public static HashMap<String, Integer> FrequencyOfWords(String string) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        String[] words = string.split(" ");
        for (String word : words) {
            if (hashmap.containsKey(word)) {
                int frequency = hashmap.remove(word);
                frequency++;
                hashmap.put(word, frequency);
            } else {
                hashmap.put(word, 1);
            }
        }
        return hashmap;
    }

    public static boolean hasDuplicates(String string) {
        String[] words = string.split(" ");
        HashSet<String> hashset = new HashSet<>();
        for(String word : words) {
            hashset.add(word);
            if(hashset.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
