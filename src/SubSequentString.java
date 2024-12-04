public class SubSequentString {

    public static void main(String[] args) {
        String str1 = "zc";
        String str2 = "ad";
        System.out.println(canMakeSubsequence(str1, str2));
    }

    public static boolean canMakeSubsequence(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            char[] charArray1 = str1.toCharArray();
            if (charArray1[i] == 'z') {
                charArray1[i] = 'a';
            } else {
                charArray1[i] = (char) ((str1.charAt(i) - 'a' + 1) % 26 + 'a');
            }
            StringBuilder string = new StringBuilder();
            string.append(charArray1);
            System.out.println(string);
            int k = 0;
            int count = 0;
            for (int j = 0; j < str1.length(); j++) {
                if (string.charAt(j) == str2.charAt(k)) {
                    k++;
                    count++;
                    if (count == str2.length()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
