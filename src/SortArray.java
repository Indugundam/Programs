import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 1, 3, 3, 2, 4};
        System.out.println(Arrays.toString(frequencySort(array)));
    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int[] array = new int[nums.length];
        for (int key : nums) {
            if (hashmap.containsKey(key)) {
                int freq = hashmap.remove(key);
                freq++;
                hashmap.put(key, freq);
            } else {
                hashmap.put(key, 1);
            }
        }
        List<Frequency> numbers = new ArrayList<>();
        for (int key : hashmap.keySet()) {
            numbers.add(new Frequency(key, hashmap.get(key)));
        }
        numbers.sort((e1, e2) -> {
            if(e1.value != e2.value) return e1.value - e2.value;
            else return e2.key - e1.key;
        });
        int k = 0;
        for (Frequency obj : numbers) {
            for (int i = 0; i < obj.value; i++) {
                array[k] = obj.key;
                k++;
            }
        }
        return array;
    }
}

class Frequency {
    int key;
    int value;

    public Frequency(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
