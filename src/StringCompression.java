public class StringCompression {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(compress(str));
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress2(chars));
    }

    public static String compress(String s) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
            else {
                str.append(s.charAt(i));
                str.append(count);
                count = 1;
            }
        }
        str.append(s.charAt(s.length() - 1));
        str.append(count);
        return str.toString();
    }

    public static int compress2(char[] chars) {
        if(chars.length == 1) return 1;
        StringBuilder str = new StringBuilder();
        int count = 1;
        for(int i = 0; i < chars.length - 1; i++) {
            if(chars[i] == chars[i + 1]) {
                count++;
            }
            else {
                str.append(chars[i]);
                str.append(count);
                count = 1;
            }
        }
        str.append(chars[chars.length - 1]);
        str.append(count);
        System.out.println(str.toString());
        char[] charArray = str.toString().toCharArray();
        return charArray.length;
    }
}
