import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnagrams(strs);
        for(List<String> ls : list) {
            System.out.println(ls);
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list1 = new ArrayList<>(); // List of lists to hold groups of anagrams

        for (int i = 0; i < strs.length; i++) {
            boolean isAdded = false;
            char[] charArray1 = strs[i].toCharArray();
            Arrays.sort(charArray1); // Sort the current string

            for (List<String> group : list1) {
                char[] charArray2 = group.get(0).toCharArray(); // Compare with the first string in each group
                Arrays.sort(charArray2);

                if (Arrays.equals(charArray1, charArray2)) {
                    group.add(strs[i]); // Add the current string to the group if it's an anagram
                    isAdded = true;
                    break;
                }
            }

            if (!isAdded) {
                // Create a new group if the string doesn't fit into any existing group
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                list1.add(newGroup);
            }
        }

        return list1;
    }
}
