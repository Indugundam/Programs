import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SemesterResults {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\indug\\OneDrive\\Documents\\Marks.csv"));
        String fileName = "C:\\Users\\indug\\OneDrive\\Documents\\semMarks.csv";
        FileWriter writer = new FileWriter(fileName);
        int totalMarks;
        int highest = Integer.MIN_VALUE;
        int semester = 0;
        for (int i = 0; i < lines.size(); i++) {
            totalMarks = 0;
            String[] marks = lines.get(i).split(",");
            for (int j = 0; j < marks.length; j++) {
                int mark = Integer.parseInt(marks[j]);
                totalMarks += mark;
                if (totalMarks > highest) {
                    highest = totalMarks;
                    semester = i + 1;
                }
            }
            writer.write(lines.get(i) + "," + totalMarks + "\n");
        }
        writer.flush();
        System.out.println("Best marks are scored in semester " + semester);
    }

}

