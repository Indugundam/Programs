public class StringEquivalence {
    public static void main(String[] args) {
        String[] str1 = {"ab", "c", "def"};
        String[] str2 = {"a", "bcd", "ef"};
        System.out.println(arrayStringsAreEqual(str1, str2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(int i = 0; i < word1.length; i++) {
            str1.append(word1[i]);
        }
        for(int j = 0; j < word2.length; j++) {
            str2.append(word2[j]);
        }
        if(str1.toString().equals(str2.toString())) {
            return true;
        }
        return false;
    }
}
