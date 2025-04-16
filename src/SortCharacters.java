import java.util.Arrays;
import java.util.HashMap;

public class SortCharacters {
    public static void main(String[] args) {
//        frequencySort("tree");
        int[] array = {1, 1, 1, 2, 2, 3};
        topKFrequent(array, 2);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Test[] t = new Test[]{new Test()};
        int arr[] = new int[k];
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int freq = map.remove(nums[i]);
                freq++;
                map.put(nums[i], freq);
                t[i].n = nums[i];
                t[i].freq = freq;
            }
            else {
                map.put(nums[i],  1);
                t[i].n = nums[i];
                t[i].freq = 1;
            }
        }

        Arrays.sort(t, (a, b) -> (a.freq - b.freq));

        for(int i = 0; i < k; i++) {
            arr[i] = t[i].n;
        }

        return arr;
    }
}

class Test {
    int n;
    int freq;

}



//import java.util.Arrays;
//
//public class SortCharacters {
//    public static void main(String[] args) {
//        frequencySort("tree");
//    }
//    public static String frequencySort(String s) {
//        int[] array = new int[26];
//        for(int i = 0; i < s.length(); i++) {
//            array[s.charAt(i) - 'a']++;
//        }
//
//        Sort[] m = new Sort[26];
//        for(int i = 0; i < 26; i++) {
//            m[i] = new Sort();
//            m[i].index = i;
//            m[i].freq = array[i];
//        }
//        Arrays.sort(m, (a, b) -> (b.freq - a.freq));
//
//        int k = 0;
//        StringBuilder str = new StringBuilder();
//        while(m[k].freq > 0) {
//            for(int i = 0; i < m[k].freq; i++) {
//                str.append((char)(m[i].index + 'a'));
//            }
//        }
//        return str.toString();
//    }
//}
//
//class Sort {
//    int index;
//    int freq;
//}
//
