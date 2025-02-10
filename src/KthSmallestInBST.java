import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestInBST {
    public static void main(String[] args) {

    }
    public int kthSmallest(TreeNode root, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        kthSmallestUtil(queue, root, k);
        return queue.peek();

    }

    public void kthSmallestUtil(PriorityQueue<Integer> queue, TreeNode root, int k) {

        if(root == null) return;
        if(queue.size() < k) {
            queue.add(root.data);
        }
        else {
            queue.add(root.data);
            queue.poll();
        }

        kthSmallestUtil(queue, root.left, k);
        kthSmallestUtil(queue, root.right, k);
    }
}
