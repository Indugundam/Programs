import java.util.ArrayList;

public class CommonElement {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {2, 3, 8, 9, 10};
        int[] array3 = {1, 2, 3, 4, 11, 15, 17};
        ArrayList<Integer> commonNumber = findCommon(array1, array2, array3);
        for(int element : commonNumber) {
            System.out.println(element);
        }
    }

    private static ArrayList<Integer> findCommon(int[] array1, int[] array2, int[] array3) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int i = 0; i < array1.length; i++) {
            if(match(array2, array1[i]) && match(array3, array1[i])) {
                arraylist.add(array1[i]);
            }
        }
        return arraylist;
    }
    public static boolean match(int[] array, int ele) {
        for(int j = 0; j < array.length; j++) {
            if(array[j] == ele) {
                return true;
            }
        }
        return false;
    }
}
