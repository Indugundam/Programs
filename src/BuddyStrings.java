public class BuddyStrings {
    public static void main(String[] args) {
        String str = "ab";
        String goal = "ba";
        System.out.println(buddyStrings(str, goal));
    }
    public static boolean buddyStrings(String s, String goal) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)) {
                count++;
            }
        }
        return count == 2;
    }
}

//char[] charArray = s.toCharArray();
//        for(int i = 0; i < s.length(); i++) {
//        for(int j = i + 1; j < s.length(); j++) {
//char temp = charArray[i];
//charArray[i] = charArray[j];
//charArray[j] = temp;
//                if(goal.equals(new String(charArray))) {
//        return true;
//        }
//temp = charArray[i];
//charArray[i] = charArray[j];
//charArray[j] = temp;
//            }
//                    }
//                    return false;
