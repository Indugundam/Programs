public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        int[] alphabets = new int[26];
        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            int index = ch - 97;
            alphabets[index]++;
        }
        for(int j = 0; j < 26; j++) {
            if(alphabets[j] == 0) {
                return false;
            }
        }
        return true;
    }
}
