import java.io.File;
import java.util.ArrayList;

public class LargestFile {
    public static void main(String[] args) {
        String file = largestFile(new File("C:\\Users\\indug\\mysite\\trackerapp"));
        System.out.println(file);

    }

    static long max_length = Integer.MIN_VALUE;
    static String largestFile = null;

    public static String largestFile(File path) {
        File files[] = path.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if (file.length() > max_length) {
                    max_length = file.length();
                    largestFile = file.getPath();
                }
            } else {
                largestFile(file);
            }
        }
        return largestFile;
    }
}
