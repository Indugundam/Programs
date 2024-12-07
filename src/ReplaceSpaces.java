public class ReplaceSpaces {
    public static void main(String[] args) {

        String str = "Mr John Smith    ";
        System.out.println(removeSpaces(str));
    }

    public static String removeSpaces(String str) {

        StringBuilder string = new StringBuilder();
        String[] strings = str.split(" ");
        int spaces = strings.length - 1;
        int len = 0;
        for(String s : strings) {
            len += s.length();
        }
        len += spaces;
        System.out.println(len);

        for(int i = 0; i < len; i++) {
            if(str.charAt(i) == ' ') {
                string.append("%20");
            }
            else {
                string.append(str.charAt(i));
            }
        }

        return string.toString();
    }
}

