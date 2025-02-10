public class MinimumJumps {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minimumJumps(array));
    }
    public static int minimumJumps(int[] arr) {
        int jumps = 1;
        int index = arr[0];
        while(index < arr.length - 1) {
            if(arr[index] == 0) {
                return -1;
            }
            else {
                index += arr[index];
                jumps++;
            }
        }
        return jumps;
    }
}
