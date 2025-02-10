import java.util.Stack;

public class MirrorScore {
    public static void main(String[] args) {
        String str = "aczzx";
        System.out.println(calculateScore(str));
    }
//    public static long calculateScore(String s) {
//        long score = 0;
//        boolean[] marked = new boolean[s.length()];
//        int[] array = new int[26];
//        for(int i = 0; i < 13; i++) {
//            array[i] = i;
//            array[array.length - 1 - i] = i;
//        }
//        for(int i = 1; i < s.length(); i++) {
//            for(int j = i - 1; j >= 0; j--) {
//                int p = s.charAt(i) - 97;
//                int q = s.charAt(j) - 97;
//                if(!marked[i] && !marked[j] && (array[p] == array[q]) && p != q) {
//                    marked[i] = true;
//                    marked[j] = true;
//                    score += (i - j);
//                }
//            }
//        }
//        return score;
//    }
//}

    public static long calculateScore(String s) {
        long score = 0;

        // Take 26 stacks, each stack for one alphabet.
        // Each alphabet's stack will hold the mirror
        // alphabets seen so far in the string
        Stack<Integer>[] stacks = new Stack[26];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<Integer>();
        }

        for (int i = 0; i < s.length(); i++) {
            int p = s.charAt(i) - 'a';
            // This p could be a candidate mirror for an upcoming letter.
            // For example: if p is letter 'a', then 25 - p is letter 'z'.
            // So this letter 'a' could be a candidate for the upcoming letter 'z'.
            // That means, save this letter in to 25th stack. Why stack? Will explain latter.
            stacks[25 - p].push(i);

            // According to the question if the current letter has a
            //        // mirror letter then we should mark both of the indexes
            //        if (!stacks[p].isEmpty()) {
            //            int mirrorIndex = stacks[p].pop(); // By popping, we are effectively marking/removing the mirror letter from letter 'a' stack
            //            score += i - mirrorIndex;
            //            stacks[25 - p].pop(); // By popping, we are effectively marking/removing ourselves from the mirror letter's(letter 'z') stack
            //        }
            //    }
        }
        return score;
    }
}