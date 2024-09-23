public class RotateString {
    public static void main(String[] args) {
        String s = "stfir";
        String goal = "first";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.insert(s.length(), s.charAt(i));
            System.out.println(stringBuilder);
            stringBuilder.deleteCharAt(0);
            System.out.println(stringBuilder + "\n");
            if (stringBuilder.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
