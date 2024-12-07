public class WildCardMatching {
    public static void main(String[] args) {
        String s = "";
        String p = "******";
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {
        int index = 0;
        if(s == "") return true;
        for(int i = 0; i < s.length(); i++) {
            if(p.charAt(index) == '*') {
                return true;
            }
            else if(p.charAt(index) == '?') {
                index++;
            }
            else {
                if(s.charAt(i) != p.charAt(index)) {
                    return false;
                }
            }
        }
        return p.length() > s.length();
    }
}
