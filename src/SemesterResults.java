import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SemesterResults {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\indug\\OneDrive\\Documents\\Marks.csv"));
        ArrayList<Integer> total = new ArrayList<>();
        int totalMarks = 0;
        for (String line : lines) {
            String[] marks = line.split(",");
            for(int i = 0; i < marks.length; i++) {
                int mark = Integer.parseInt(marks[i]);
                totalMarks += mark;
            }
            total.add(totalMarks);
            totalMarks = 0;
        }
        for(int ele : total) {
            System.out.println(ele);
        }
    }
}
