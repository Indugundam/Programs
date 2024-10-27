import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        int[][] nums = {
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}
        };
        List<Integer> list = intersection(nums);
        for (int ele : list) {
            System.out.println(ele);
        }
    }

    public static List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (hashmap.containsKey(nums[i][j])) {
                    int freq = hashmap.remove(nums[i][j]);
                    freq++;
                    hashmap.put(nums[i][j], freq);
                } else {
                    hashmap.put(nums[i][j], 1);
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Integer key : hashmap.keySet()) {
            if (hashmap.get(key) == nums.length) {
                list.add(key);
            }
        }
        list.sort((e1, e2) -> e1 - e2);
        return list;
    }
}
