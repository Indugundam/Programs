public class StringCompare {
    public static void main(String[] args) {
        String str1 = "ab#c";
        String str2 = "ad#c";
        System.out.println(backspaceCompare(str1, str2));

    }

    public static boolean backspaceCompare(String s, String t) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (string1.length() > 0) {
                    string1.deleteCharAt(string1.length() - 1);
                }
            } else {
                string1.append(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (string2.length() > 0) {
                    string2.deleteCharAt(string2.length() - 1);
                }
            } else {
                string2.append(t.charAt(i));
            }
        }
        return string1.toString().equals(string2.toString());
    }
}
