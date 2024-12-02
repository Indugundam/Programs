import java.io.*;
import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\indug\\OneDrive\\Documents\\input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+"); // Split by whitespace
                if (parts.length == 2) {
                    list1.add(Integer.parseInt(parts[0]));
                    list2.add(Integer.parseInt(parts[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(list1);
        Collections.sort(list2);

        int totalDistance = 0;
        for (int i = 0; i < list1.size(); i++) {
            totalDistance += Math.abs(list1.get(i) - list2.get(i));
        }

        System.out.println("Total Distance: " + totalDistance);

        int similarityScore = 0;
        for (int num : list1) {
            int count = Collections.frequency(list2, num);
            similarityScore += num * count;
        }

        // Print the similarity score
        System.out.println("Similarity Score: " + similarityScore);
    }
}
