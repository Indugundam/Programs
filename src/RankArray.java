import java.util.Arrays;
import java.util.HashMap;

public class RankArray {
    public static void main(String[] args) {
        int[] array = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(array)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] ranks = new int[arr.length];
        int[] array = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int index = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            index = i - count + 1;
            if(hashmap.containsKey(array[i])) {
                count++;
            }
            else  {
                hashmap.put(array[i], index);
            }
        }
        for(int i = 0; i < ranks.length; i++) {
            ranks[i] = hashmap.get(arr[i]);
        }
        return ranks;
    }
}
