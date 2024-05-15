import java.util.HashMap;

public class RemoveDuplicates
{
    public static void main(String [] args) {
        String string = "hardware";
        System.out.println(removeDuplicates(string));

    }
    public static String removeDuplicates(String string) {
        HashMap<String,Integer> hashmap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] characters = string.toCharArray();
        for(char character : characters) {
            if(!hashmap.containsKey(character)) {
                hashmap.put(String.valueOf(character),1);
            }

        }

            return hashmap.keySet().toString() ;
    }

}
