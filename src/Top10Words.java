import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Top10Words {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\indug\\OneDrive\\Documents\\samplePara.txt"));
        displayTop10Words(lines);
    }

    private static void displayTop10Words(List<String> lines) {
        HashMap<String, Integer> hashmap = new HashMap<>();

        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                word = word.toLowerCase();
                if (hashmap.containsKey(word)) {
                    int frequency = hashmap.remove(word);
                    frequency++;
                    hashmap.put(word, frequency);
                } else {
                    hashmap.put(word, 1);
                }

            }
        }

        List<WordFrequency> words = new ArrayList<>();
        for (String key : hashmap.keySet()) {
            words.add(new WordFrequency(key, hashmap.get(key)));
        }
        words.sort((e1, e2) -> e2.frequency - e1.frequency);

        System.out.println("Top 10 occuring words are: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(words.get(i));
        }
    }
}

class WordFrequency {
    public String word;
    public int frequency;

    public WordFrequency(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return word + ':' + frequency;
    }
}




