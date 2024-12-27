import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> myList = Arrays.asList("apple", "pen");
        System.out.println(wordBreak(s, myList));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        StringBuilder str = new StringBuilder();
        str.append(s);
        for (int i = 0; i < wordDict.size(); i++) {
            int index = str.indexOf(wordDict.get(i));
            while (index != -1) {
                str.delete(index, index + wordDict.get(i).length());
                index = str.indexOf(wordDict.get(i));
            }
        }
        if (str.toString().length() == 0) {
            return true;
        }
        return false;
    }

}
