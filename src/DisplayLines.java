import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

public class DisplayLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\indug\\OneDrive\\Documents\\samplePara.txt";
        displayLinesFromStart(path, 30);
        System.out.println("\n");
        displayLinesFromEnd(path, 10);
    }

    public static void displayLinesFromStart(String path, int n) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        int min = Math.min(n, lines.size());
        for (int i = 0; i < min; i++) {
            System.out.println(lines.get(i));
        }
    }

    public static void displayLinesFromEnd(String path, int n) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        int min = Math.min(n, lines.size());
        for (int i = lines.size() - min; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }
}

