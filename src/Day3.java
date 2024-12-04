import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\indug\\OneDrive\\Documents\\input3.txt"));
        String line;
        int sum = 0;
        int n1 = 0;
        int n2 = 0;
        while ((line = br.readLine()) != null) {
            String regex = "mul\\((\\d+),(\\d+)\\)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                n1 = Integer.parseInt(matcher.group(1)); // First group
                n2 = Integer.parseInt(matcher.group(2)); // First group
                sum += n1 * n2;
            }
        }
        System.out.println(sum);
    }
}
