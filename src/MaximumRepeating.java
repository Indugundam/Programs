public class MaximumRepeating {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }

    public static int maxRepeating(String sequence, String word) {
        String repeatedWord = word;
        int count = 0;
        while (sequence.contains(repeatedWord)) {
            count++;
            repeatedWord += word;
        }
        return count;
    }
}
