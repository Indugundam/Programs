import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        List<String> file1 = Files.readAllLines(Paths.get("C:\\Users\\indug\\OneDrive\\Documents\\file1.txt"));
        List<String> file2 = Files.readAllLines(Paths.get("C:\\Users\\indug\\OneDrive\\Documents\\file2.txt"));
        FileWriter filewriter = new FileWriter("C:\\Users\\indug\\OneDrive\\Documents\\file3.txt");
        for (String line : file1) {
            filewriter.write(line);
        }
        for (String line : file2) {
            filewriter.write(line);
        }
        filewriter.flush();
    }
}
