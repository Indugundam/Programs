import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
    public static void main(String[] args) {

    }
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++) {
//            if(Math.abs(arr[i] - arr[i + 1]) <= 1)
        }
        return list;
    }
}
