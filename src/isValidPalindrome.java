public class isValidPalindrome {
    public static void main(String[] args) {
        String s = "0p";
        System.out.println(isPalindrome(s));
    }
        public static boolean isPalindrome(String s) {
            if(s == "") {
                return true;
            }
            String s1 = s.toLowerCase();
            System.out.println(s1);
            StringBuilder string = new StringBuilder();
            StringBuilder reverse = new StringBuilder();
            for(int i = 0; i < s1.length(); i++) {
                if((s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') || (s1.charAt(i) >= '0' && s1.charAt(i) <= '9')) {
                    string.append(s1.charAt(i));
                }
            }
            string.toString();
            System.out.println(string);
            for(int i = string.length() - 1; i >= 0; i--) {
                reverse.append(string.charAt(i));
            }
            reverse.toString();
            System.out.println(reverse);
            for(int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != reverse.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

