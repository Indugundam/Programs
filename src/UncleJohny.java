import java.util.*;
import java.lang.*;

class UncleJohny {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 9, 4,};
        int k = 5;
        int uncle = arr[k - 1];
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == uncle) {
                System.out.println(i + 1);
            }
        }
    }
}
