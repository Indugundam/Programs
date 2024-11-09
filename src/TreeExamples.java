class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}

class TreeExamples {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(20);
        node.right = new TreeNode(30);
        node.left.left = new TreeNode(40);
        node.left.right = new TreeNode(50);
        node.right.left = new TreeNode(60);
        node.right.right = new TreeNode(10);

        System.out.println(numberOfNodes(node));
        System.out.println(height(node));
        System.out.println(isFound(node, 10));
        System.out.println(minimum(node));
        System.out.println(countLeafNodes(node));
        System.out.println(isSumTree(node));
    }

    public static int numberOfNodes(TreeNode node) {

        if (node == null) return 0;

        int leftNodeCount = numberOfNodes(node.left);
        int rightNodeCount = numberOfNodes(node.right);

        return leftNodeCount + rightNodeCount + 1;

    }

    public static int height(TreeNode node) {

        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static boolean isFound(TreeNode node, int key) {

        if (node == null) return false;
        if (node.data == key) return true;
        boolean leftFound = isFound(node.left, key);
        boolean rightFound = isFound(node.right, key);

        return leftFound || rightFound;
    }

    public static int minimum(TreeNode node) {

        if (node == null) return Integer.MAX_VALUE;

        int leftMin = minimum(node.left);
        int rightMin = minimum(node.right);

        return Math.min(Math.min(leftMin, rightMin), node.data);
    }

    public static int countLeafNodes(TreeNode node) {

        if (node == null) return 0;

        int leftCount = countLeafNodes(node.left);
        int rightCount = countLeafNodes(node.right);

        if (leftCount == 0 && rightCount == 0) return 1;
        return leftCount + rightCount;
    }

    public static boolean isSumTree(TreeNode root) {

        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        boolean leftSumTree = isSumTree(root.left);
        boolean rightSumTree = isSumTree(root.right);

        int leftData = root.left == null ? 0 : root.left.data;
        int rightData = root.right == null ? 0 : root.right.data;

        return leftData + rightData == root.data && leftSumTree && rightSumTree;

    }

}


