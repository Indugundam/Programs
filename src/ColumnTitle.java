public class ColumnTitle {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(convertToTitle(num));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        int rem = columnNumber;
        int asciiValue = 64 + columnNumber;
        if(columnNumber > 26) {
            rem = rem - 26;


        }
        return columnTitle.toString();
    }
}


