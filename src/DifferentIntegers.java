//import java.util.HashSet;
//
//public class DifferentIntegers {
//    public static void main(String[] args) {
//        String word = "leet1234code234";
//        System.out.println(numDifferentIntegers(word));
//    }
//
//    public static int numDifferentIntegers(String word) {
//        StringBuilder str = new StringBuilder();
//        HashSet<String> hashSet = new HashSet<>();
//        boolean flag = false;
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
//                if (word.charAt(i) != 0) {
//                    flag = true;
//                }
//                if (flag) {
//                    str.append(word.charAt(i));
//                }
//            } else {
//                if (!str.isEmpty()) {
//                    hashSet.add(str.toString());
//                    System.out.println(str.toString());
//                    str.delete(0, str.length());
//                }
//            }
//        }
//        System.out.println(hashSet);
//        return hashSet.size();
//    }
//}

import java.util.HashSet;

public class DifferentIntegers {
    public static void main(String[] args) {
        String word = "leet1234code234";
        System.out.println(numDifferentIntegers(word));
    }

    public static int numDifferentIntegers(String word) {
        StringBuilder str = new StringBuilder();
        HashSet<String> hashSet = new HashSet<>();
        boolean flag = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= '0' && ch <= '9') {
                if (!(str.length() == 0 && ch == '0')) { // Skip leading zeros
                    str.append(ch);
                }
            } else {
                if (str.length() > 0) {
                    hashSet.add(str.toString());
                    System.out.println("Number added: " + str.toString());
                    str.setLength(0); // Reset the StringBuilder
                }
            }
        }

        // Add the last number if any
        if (str.length() > 0) {
            hashSet.add(str.toString());
            System.out.println("Number added: " + str.toString());
        }

        System.out.println("HashSet: " + hashSet);
        return hashSet.size();
    }
}

