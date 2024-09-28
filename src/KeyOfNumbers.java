public class KeyOfNumbers {
    public static void main(String[] args) {
        int num1 = 987;
        int num2 = 879;
        int num3 = 798;
        System.out.println(generateKey(num1, num2, num3));
    }
    public static int generateKey(int num1, int num2, int num3) {
        String n1 = padding(num1);
        String n2 = padding(num2);
        String n3 = padding(num3);
        StringBuilder key = new StringBuilder();
        for(int i = 0; i < 4; i++) {
            char min = (n1.charAt(i) < n2.charAt(i)) ? (n1.charAt(i) < n3.charAt(i) ? n1.charAt(i) : n3.charAt(i)) : (n2.charAt(i) < n3.charAt(i) ? n2.charAt(i) : n3.charAt(i));
            if(min == 0 && key.length() == 0) {
                continue;
            }
            else {
                key.append(min);
            }
        }
        int minimum = Integer.parseInt(key.toString());
        return minimum;
    }
    public static String padding(int num) {
        StringBuilder str1 = new StringBuilder();
        str1.append(num);
        int len = str1.length();
        for(int i = 0; i < 4 - len; i++) {
            str1.insert(i, "0");
        }
        return str1.toString();
    }
}
