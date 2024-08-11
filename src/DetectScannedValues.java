import java.util.ArrayList;

public class DetectScannedValues {
    public static void main(String[] args) {
        String ocr = """
    4  4 77777  11   11    4  4  22
    4  4    7  111  111    4  4 2  2
    4444   7    11   11    4444   2
       4   7    11   11       4  2
       4   7   1111 1111      4 2222""";
        ArrayList<String> scannedNumber = scanTheDigits(ocr);
        for(String number : scannedNumber) {
            System.out.print(number);
        }
    }

    private static ArrayList<String> scanTheDigits(String ocr) {
        ArrayList<String> arraylist = new ArrayList<>();
        int k = 0;
        String[] lines = ocr.split("\n");
        int[] index = new int[lines[0].length()];
        for(int i = 0; i < minLength(lines); i++) {
            boolean allSpaces = true;
            for (String line : lines) {
                if (line.charAt(i) != ' ') {
                    allSpaces = false;
                    break;
                }
            }
            if (allSpaces == true) {
                index[k] = i;
                k++;
            }
        }
        
        for(int  i = 0; i < k; i++) {
        while(lines[0].charAt(index[i] - 1) != ' '){
                index[i] = index[i] - 1;
                break;
            }
            arraylist.add(String.valueOf(lines[0].charAt(index[i])));
        }
        return arraylist;
    }

    private static int minLength(String[] lines) {
        int minLength = Integer.MAX_VALUE;
        for(String line : lines) {
            if(line.length() < minLength) {
                minLength = line.length();
            }
        }
        return minLength;
    }
}
