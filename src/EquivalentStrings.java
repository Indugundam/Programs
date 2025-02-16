public class EquivalentStrings {
    public static void main(String[] args) {
        String s = "";
        int num = 9_9_9;
        String s1 = "abcdeef";
        String s2 = "abaaacc";
        System.out.println(checkAlmostEquivalent(s1, s2));
        System.out.println(s);
        System.out.println(num + 1);
        float f = (float)5.0;
        System.out.println(f);
    }
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for(int i = 0; i < word1.length(); i++) {
            System.out.println(word1.charAt(i) - 'a');
            array1[word1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < word2.length(); i++) {
            array2[word2.charAt(i) - 'a']++;
        }

        for(int j = 0; j < 26; j++) {
            System.out.print(array1[j] + " ");
            System.out.println(array2[j]);
            if(Math.abs(array1[j] - array2[j]) > 3) {
                return false;
            }
        }
        return true;
    }
}
