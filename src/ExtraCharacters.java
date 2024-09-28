public class ExtraCharacters {
    public static void main(String[] args) {
        String[] dictionary = {"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"};
        String string = "dwmodizxvvbosxxw";
        int minExtraChars = minExtraChar(string, dictionary);
        System.out.println(minExtraChars);
    }
    public static int minExtraChar(String s, String[] dictionary) {
        int length = s.length();
        for(int i = 0; i < dictionary.length; i++) {
            if(s.contains(dictionary[i])) {
                System.out.println(dictionary[i]);
                length -= dictionary[i].length();
            }
        }
        return length;
    }
}
