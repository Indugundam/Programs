public class AddingSpaces {

    public static void main(String[] args) {

        String str = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        System.out.println(addSpaces(str, spaces));

    }

    public static String addSpaces(String s, int[] spaces) {

        StringBuilder string = new StringBuilder();
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(index < spaces.length && i == spaces[index]) {
                string.append(' ');
                index++;
                string.append(s.charAt(i));
            }
            else {
                string.append(s.charAt(i));
            }
        }
        return string.toString();
    }
}
