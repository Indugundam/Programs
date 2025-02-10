import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonIn3SortedArrays {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 5, 10, 20, 40, 80));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(6, 7, 20, 80, 100));
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(3, 4, 15, 20, 30, 70, 80, 120));
        System.out.println(commonElements(arr1, arr2, arr3));

    }
    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.size() && j < arr2.size()) {
            if(arr1.get(i).equals(arr2.get(j))) {
                list1.add(arr1.get(i));
                i++;
                j++;
            }
            else if(arr1.get(i) < arr2.get(j)) {
                i++;
            }
            else {
                j++;
            }
        }
        for(int k = 0; k < list1.size(); k++) {
            if(arr3.contains(list1.get(k))) {
                list2.add(list1.get(k));
            }
        }
        return list2;
    }
}
