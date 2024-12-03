import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day2 {

    public static void main(String[] args) throws IOException, IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\indug\\OneDrive\\Documents\\input2.txt"));
        String report;
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        boolean isSafe = false;
        while ((report = br.readLine()) != null) {
            String[] levels = report.split(" ");
            count += safeCount(levels);
            for (int j = 0; j < levels.length; j++) {
                List<String> list1 = new ArrayList<>();
                for (int k = 0; k < levels.length; k++) {
                    isSafe = false;
                    if (j != k) {
                        list1.add(levels[k]);
                    }
                }
                String[] levels2 = new String[list1.size()];
                for (int k = 0; k < levels.length - 1; k++) {
                    levels2[k] = list1.get(k);
                }
                count2 = safeCount(levels2);
                if (count2 == 1) {
                    isSafe = true;
                    count3++;
                    break;
                }

            }
        }
        System.out.println(count3);

    }

    public static int safeCount(String[] level) {
        int icount = 0;
        int dcount = 0;
        int safeCount = 0;

        for (int i = 0; i < level.length - 1; i++) {

            int difference = Integer.parseInt(level[i]) - Integer.parseInt(level[i + 1]);
            int absdifference = Math.abs(Integer.parseInt(level[i]) - Integer.parseInt(level[i + 1]));
            if (difference > 0 && absdifference >= 1 && absdifference <= 3) {
                dcount++;
            }
            if (difference < 0 && absdifference >= 1 && absdifference <= 3) {
                icount++;
            }
        }
        if (dcount == level.length - 1 || icount == level.length - 1) {
            safeCount++;
        }

        return safeCount;
    }
}