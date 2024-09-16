public class ColumnTitle {
    public static void main(String[] args) {
        int num = 30;
        System.out.println(convertToTitle(num));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            columnTitle.append((char) ('A' + remainder));
            columnNumber = columnNumber / 26;
        }
        columnTitle.reverse();
        return columnTitle.toString();
    }
}


