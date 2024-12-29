public class MaxScore {
    public static void main(String[] args) {
    String s = "011101";
        System.out.println(maxScore(s));
    }
    public static int maxScore(String s) {
        int leftZeros = 0;
        int rightOnes = 0;
        int maxScore = Integer.MIN_VALUE;
        int score = 0;
        int index = 0;
        while(s.charAt(index) == '0') {
            leftZeros++;
            index++;
        }
        for(int i = index; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                rightOnes++;
            }
        }
        maxScore = leftZeros + rightOnes;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                leftZeros++;
            }
            else{
                rightOnes--;
            }
            score = leftZeros + rightOnes;
            maxScore = Math.max(score, maxScore);
        }
        return maxScore;
    }
}
