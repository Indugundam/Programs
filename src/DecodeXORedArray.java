import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded = {1, 3, 0, 4};
        int first = 2;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }
    public static int[] decode(int[] encoded, int first) {
        int[] array = new int[encoded.length + 1];
        array[0] = first;
        for(int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] ^ encoded[i - 1];
        }
        return array;
    }
}
