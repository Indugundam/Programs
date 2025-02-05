public class MirrorScore {
    public static void main(String[] args) {
        String str = "aczzx";
        System.out.println(calculateScore(str));
    }
    public static long calculateScore(String s) {
        long score = 0;
        boolean[] marked = new boolean[s.length()];
        int[] array = new int[26];
        for(int i = 0; i < 13; i++) {
            array[i] = i;
            array[array.length - 1 - i] = i;
        }
        for(int i = 1; i < s.length(); i++) {
            for(int j = i - 1; j >= 0; j--) {
                int p = s.charAt(i) - 97;
                int q = s.charAt(j) - 97;
                if(!marked[i] && !marked[j] && (array[p] == array[q]) && p != q) {
                    marked[i] = true;
                    marked[j] = true;
                    score += (i - j);
                }
            }
        }
        return score;
    }
}
