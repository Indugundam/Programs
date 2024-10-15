public class AddBinary {
    public static void main(String[] args) {
        String a = "1100";
        String  b = "100";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int dec1 = 0;
        int dec2 = 0;
        int k = 0;
        for(int i = a.length() - 1; i >= 0; i--) {
            dec1 = (int)(dec1 + ((a.charAt(i) - '0') * Math.pow(2, k)));
            k++;
        }
        k = 0;
        for(int i = b.length() - 1; i >= 0; i--) {
            dec2 = (int)(dec2 + ((b.charAt(i) - '0') * Math.pow(2, k)));
            k++;
        }
        int sum = dec1 + dec2;
        StringBuilder string = new StringBuilder();
        while(sum > 0) {
            int rem = sum % 2;
            sum = sum / 2;
            string.append(rem);
        }
        string.reverse();
        return string.toString();
    }
}
