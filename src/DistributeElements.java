import java.util.ArrayList;
import java.util.Arrays;

public class DistributeElements {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 8};
        System.out.println(Arrays.toString(resultArray(nums)));
    }
    public static int[] resultArray(int[] nums) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        arrayList1.add(nums[0]);
        arrayList2.add(nums[1]);
        int[] result = new int[nums.length];
        for(int i = 2; i < nums.length; i++) {
            if(arrayList1.get(index1) > arrayList2.get(index2)) {
                arrayList1.add(nums[i]);
                index1++;
            }
            else {
                arrayList2.add(nums[i]);
                index2++;
            }
        }
        for(int p = 0; p < arrayList1.size(); p++) {
            result[p] = arrayList1.get(p);
        }
        int q = 0;
        for(int k = arrayList1.size(); k < nums.length; k++) {
            result[k] = arrayList2.get(q);
            q++;
        }
        return result;
    }
}
