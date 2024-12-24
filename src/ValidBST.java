
public class ValidBST {
    static boolean isBSTUtil(Node1 node, int min, int max) {

        if (node == null) return true;

        if (node.data < min || node.data > max) return false;

        boolean isLeftBST =  isBSTUtil(node.left, min, node.data - 1);
        boolean isRightBST =  isBSTUtil(node.right, node.data + 1, max);

        return isLeftBST && isRightBST;
    }
    static boolean isBST(Node1 root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {

        // Create a sample binary tree
        //      4
        //    /   \
        //   2     5
        //  / \
        // 1   3
        Node1 root = new Node1(4);
        root.left = new Node1(2);
        root.right = new Node1(5);
        root.left.left = new Node1(1);
        root.left.right = new Node1(3);

        if (isBST(root)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

class Node1 {
    int data;
    Node1 left, right;

    Node1(int value) {
        data = value;
        left = right = null;
    }
}