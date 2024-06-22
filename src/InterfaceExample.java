interface ISort {
    boolean process(int a, int b);
}

class ASort implements ISort {
    public boolean process(int a, int b) {
        return a > b;
    }
}

class DSort implements ISort {
    public boolean process(int a, int b) {
        return a < b;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        int array[] = {3, 5, 2, 7, 1, 9, 4};
        sort(array, new ASort());
        for(int ele : array) {
            System.out.println(ele);
        }
        System.out.println();
        sort(array, new DSort());
        for(int ele : array) {
            System.out.println(ele);
        }
    }
    public static void sort(int array[], ISort isort) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(isort.process(array[i], array[j])) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
