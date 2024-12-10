public class OneAway {
    public static void main(String[] args) {
        String str1 = "ple";
        String str2 = "pale";
        if(str1.length() == str2.length()) {
            System.out.println(oneEditReplace(str1, str2));
        }
        else if (str1.length() + 1 ==  str2.length()) {
            System.out.println(oneEditInsert(str1, str2));
        }
        else if (str1.length() - 1 ==  str2.length()) {
            System.out.println(oneEditInsert(str2, str1));
        }
        else {
            System.out.println(false);
        }
    }

    public static boolean oneEditReplace(String s1, String s2) {
        int isOneEdit = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                isOneEdit += 1;
            }
        }
        if(isOneEdit == 1) {
            return true;
        }
        return false;
    }

    public static boolean oneEditInsert(String str1, String str2) {
        int index = 0;
        int count = 0;
        //pale
        //ple
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(index)) {
                index++;
            }
            else {
                count++;
            }
        }
        if(count == 1) {
            return true;
        }
        else return false;
    }
}
