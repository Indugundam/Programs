public class Palindrome {
    public static void main(String[] args) {
        String str = "number";
//        String reverse = reverseString(str);
        boolean palindrome = isPalindrome(str);
        if (palindrome) {
            System.out.println("Given string is palindrome");
        }
        System.out.println("Not a palindrome");
    }
    //    public static String reverseString(String s) {
//        String reverse = " ";
//
//        for (int i = s.length()-1; i >= 0; i--) {
//            reverse = reverse + s.charAt(i);
//        }
//
//        return reverse;
//    }
    public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }  // l

    // paste your code as well to whatsapp
    //ok sir
}

    // You can start a new function here.
    //ok sir

    // If you are trying to do it using StringBUilder let me first show you how to use that class.
    // Just now deepika also finished. So let come back to gogle meet. paste your code in whataapp

