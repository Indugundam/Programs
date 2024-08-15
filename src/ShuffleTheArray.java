import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] array = {2, 6, 5, 1, 3, 4, 7, 9};
        int[] shuffledArray = shuffle(array);
            System.out.println(Arrays.toString(shuffledArray));

    }
    public static int[] shuffle(int[] array) {
        int[] shuffledArray = new int[array.length] ;
        int midIndex = array.length / 2;
        for(int i = 0 ; i < midIndex; i++) {
            shuffledArray[2 * i] = array[i];
            shuffledArray[(2 * i) + 1] = array[midIndex + i];
        }
        return shuffledArray;
    }
}
