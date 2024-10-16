public class ColumnNumber {
    public static void main(String[] args) {
        String str = "ZY";
        System.out.println(titleToNumber(str));
    }
    public static int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        int colNum = 1;
        if(length == 1) {
            return columnTitle.charAt(0) - 'A';
        }
        colNum = 26 + ((columnTitle.charAt(0) - 'A') * 26 + (columnTitle.charAt(1) - 'A') * 26);
        return colNum;
    }


}
