
public class DigitsAreEqual {
    public static void main(String[] args) {
        String s = "3902";
        System.out.println(hasSameDigits(s));
    }
//    public static boolean hasSameDigits(String s) {
//        StringBuilder str = new StringBuilder();
//        str.append(s);
//        while(str.length() > 2) {
//            StringBuilder str1 = new StringBuilder();
//            for(int i = 0; i < str.length() - 1; i++) {
//                int n1 = Integer.parseInt(String.valueOf(str.charAt(i)));
//                int n2 = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
//                str1.append((n1 + n2) % 10);
//            }
//            str = str1;
//        }
//        if(str.charAt(0) == str.charAt(1)) return true;
//        return false;
//    }


    public static boolean hasSameDigits(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s);
        return hasSameDigitsUtil(str);

    }

    public static boolean hasSameDigitsUtil(StringBuilder s) {
        if (s.length() == 1) return true;

        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1);
        }

        StringBuilder next = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            int n1 = s.charAt(i) - '0';
            int n2 = s.charAt(i + 1) - '0';
            next.append((n1 + n2) % 10);
        }

        return hasSameDigitsUtil(next);
    }

}
