import java.util.Arrays;

public class CountVowelStrings {
    public static void main(String[] args) {
        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = {
                {0, 2},
                {1, 4},
                {1, 1}
        };
        System.out.println(Arrays.toString(vowelStrings(words, queries)));
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] result = new int[queries.length];
        int[] prefixSum = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            char ch1 = words[i].charAt(0);
            char ch2 = words[i].charAt(words[i].length() - 1);
            if ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') && (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')) {
                prefixSum[i]++;
            }
        }
        System.out.println(Arrays.toString(prefixSum));
        for(int j = 0; j < queries.length; j++) {
            for(int k = queries[j][0]; k <= queries[j][1]; k++) {
                result[j] += prefixSum[k];
            }
        }
        return result;
    }
}
