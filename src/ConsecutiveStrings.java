public class ConsecutiveStrings {
    public static void main(String[] args) {
    String[] signs = {"F","DO","MOS","MOS","MOS","MOS","WES"};
    String[] signs1 = {"F","DO","MOS","MOS","WES","MOS","MOS","WES"};
    String[] signs2 = {"F","DO","MOS","MOS","WES","MOS","MOS","WES","MOS","MOS","WES"};
    System.out.println(isProbablyApproaching(signs));
    System.out.println(isProbablyApproaching(signs1));
    System.out.println(isProbablyApproaching(signs2));
    }

    public static boolean isProbablyApproaching(String[] signs) {
        int count = 1;
        for (int i = 0; i < signs.length - 1; i++) {
            if (signs[i].equals(signs[i + 1])) {
                count++;
            }
            else {
                count = 1;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }
}
