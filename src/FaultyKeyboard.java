public class FaultyKeyboard {
    public static void main(String[] args) {
        String s = "poiinter";
        System.out.println(finalString(s));
    }
    public static String finalString(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'i') {
                str.reverse();
            }
            else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
