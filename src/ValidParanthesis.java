public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "{[]}";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s) {
        char choice;
        int i1 = 0;
        int i2 = 0;
        int j1 = 0;
        int j2 = 0;
        int k1 = 0;
        int k2 = 0;
        for(int p = 0; p < s.length(); p++) {
            choice = s.charAt(p);
            switch(choice) {
                case '(' :
                {
                    i1++;
                    break;
                }

                case ')' :
                {
                    i2++;
                    break;
                }

                case '{' :
                {
                    j1++;
                    break;
                }

                case '}' :
                {
                    j2++;
                    break;
                }

                case '[' :
                {
                    k1++;
                    break;
                }

                case ']' :
                {
                    k2++;
                    break;
                }

            }
        }
        if(i1 == i2 && j1 == j2 && k1 == k2) {
            return true;
        }
        return false;
    }
}

//class Solution {
//    public boolean isValid(String s) {
//        char choice;
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        for(int p = 0; p < s.length(); p++) {
//            choice = s.charAt(p);
//            switch(choice) {
//                case '(' :
//                {
//                    i++;
//                    break;
//                }
//
//                case ')' :
//                {
//                    i--;
//                    break;
//                }
//
//                case '{' :
//                {
//                    j++;
//                    break;
//                }
//
//                case '}' :
//                {
//                    j--;
//                    break;
//                }
//
//                case '[' :
//                {
//                    k++;
//                    break;
//                }
//
//                case ']' :
//                {
//                    k--;
//                    break;
//                }
//
//            }
//            if((i == 1 && j == 1) || (i == 1 && k == 1) || (j == 1 && k == 1)) {
//                return false;
//            }
//        }
//        if(i == 0 && j == 0 && k == 0) {
//            return true;
//        }
//        return false;
//    }
//}