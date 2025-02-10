import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        kthLargest(arr, k);
        kthSmallest(arr, k);
    }
    public static void kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        for(int j = k; j < arr.length; j++) {
            queue.add(arr[j]);
            queue.poll();
        }
        System.out.println("kth largest element is " + queue.peek());
    }

    public static void kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        for(int j = k; j < arr.length; j++) {
            queue.add(arr[j]);
            queue.poll();
        }
        System.out.println("kth smallest element is " + queue.peek());
    }
}
