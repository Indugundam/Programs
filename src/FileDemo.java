import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\indug\\OneDrive\\Documents\\JavaText.txt"));
        int wordCount = 0;
        int charCount = 0;

        for (String line : lines) {
            String[] words = line.split("\\W+");
            wordCount += words.length;

            for (String word : words) {
                charCount += word.length();
            }
        }

        System.out.println("Number of lines: " + lines.size());
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
        sortLines(lines);
    }

    public static void sortLines(List<String> lines) {
        Collections.sort(lines);
        for(String line : lines) {
            System.out.println(line);
        }
        }
    }
