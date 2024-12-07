public class OneAway {
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "pal";
        System.out.println(isOneAway(str1, str2));
    }

    public static boolean isOneAway(String str1, String str2) {
        int index = 0;
        int count = 0;
        if(str1.length() - str2.length() > 1) return false;
        for(int i = 0; i < str1.length(); i++) {
            if(index < str2.length() && str1.charAt(i) != str2.charAt(index)) {
                count++;
            }
            else {
                index++;
            }
        }
        if(count == 1) {
            return true;
        }
        return false;
    }
}
