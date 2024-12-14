import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(1);
        node.left.left = new TreeNode(6);
        node.left.right = new TreeNode(2);
        node.right.left = new TreeNode(9);
        node.right.right = new TreeNode(8);
        node.left.right.left = new TreeNode(7);
        node.left.right.right = new TreeNode(4);

        TreeNode node3 = new TreeNode(3);
        node3.left = new TreeNode(5);
        node3.right = new TreeNode(1);
        node3.left.left = new TreeNode(6);
        node3.left.right = new TreeNode(7);
        node3.right.left = new TreeNode(4);
        node3.right.right = new TreeNode(2);
        node3.right.right.left = new TreeNode(9);
        node3.right.right.right = new TreeNode(8);


        TreeNode node2 = new TreeNode(10);
        node2.left = new TreeNode(20);
        node2.right = new TreeNode(30);
        node2.left.left = new TreeNode(40);
        node2.left.right = new TreeNode(50);
        node2.right.left = new TreeNode(60);
        node2.right.right = new TreeNode(70);


        System.out.println(numberOfNodes(node));
        System.out.println(height(node));
        System.out.println(isFound(node, 10));
        System.out.println(minimum(node));
        System.out.println(countLeafNodes(node));
        System.out.println(isSumTree(node));
        System.out.println(evaluateTree(node));
        List<String> list = path(node, node.left.left);
        System.out.println(list);
        HashMap<Integer, Integer> hashmap = frequency(node);
        for (int key : hashmap.keySet()) {
            System.out.println(key + ":" + hashmap.get(key));
        }
        System.out.println(isSameTree(node, node2));
        System.out.println(isSymmetric(node));
        TreeNode node4 = invertTree(node);
        System.out.println(node4.data);
        System.out.println(node4.left.data);
        System.out.println(node4.right.data);
//        System.out.println(node4.left.left.data);
        System.out.println(node4.left.right.data);
        System.out.println(node4.right.left.data);
        System.out.println(node4.right.right.data);
        System.out.println();
        System.out.println(invertTree(node).data);

        System.out.println(leafSimilar(node, node3));
        System.out.println(isUnivalTree(node2));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return null;

        if(root.data == p.data || root.data == q.data) {
            return root;
        }

        TreeNode lnode = lowestCommonAncestor(root.left, p, q);
        TreeNode rnode = lowestCommonAncestor(root.right, p, q);

        if(lnode != null && rnode != null) {
            return root;
        }
        if(lnode != null) {
            return lnode;
        }
        if(rnode != null) {
            return rnode;
        }
        return null;
    }
    public static boolean isUnivalTree(TreeNode root) {

        HashSet<Integer> hashSet = new HashSet<>();
        isUnivalTreeUtil(root, hashSet);

        if (hashSet.size() == 1) return true;
        return false;
    }

    public static void isUnivalTreeUtil(TreeNode root, HashSet<Integer> hashset) {

        if (root == null) return;

        hashset.add(root.data);

        isUnivalTreeUtil(root.left, hashset);
        isUnivalTreeUtil(root.right, hashset);
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        leafSimilarUtil(root1, list1);
        leafSimilarUtil(root2, list2);

        System.out.println(list1);
        System.out.println(list2);

        if (list1.size() != list2.size()) return false;

        else {
            for (int i = 0; i < list1.size(); i++) {
                if (!list1.get(i).equals(list2.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void leafSimilarUtil(TreeNode root, List<Integer> list) {

        if (root == null) return;

        if (root.left == null && root.right == null) {
            list.add(root.data);
        }

        leafSimilarUtil(root.left, list);
        leafSimilarUtil(root.right, list);

    }

    public static TreeNode invertTree(TreeNode root) {

        invertTreeUtil(root);
        return root;
    }

    public static void invertTreeUtil(TreeNode root) {

        if (root == null) return;

        invertTreeUtil(root.left);
        invertTreeUtil(root.right);

        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }


    public static int sumOfLeftLeaves(TreeNode root) {

        return sumOfLeftLeavesUtil(root, true);

    }

    public static int sumOfLeftLeavesUtil(TreeNode root, boolean isLeftNode) {

        if (root == null) return 0;

        if (root.left == null && root.right == null && isLeftNode) return root.data;

        if (root.left == null && root.right == null) return 0;

        int leftSum = sumOfLeftLeavesUtil(root.left, true);
        int rightSum = sumOfLeftLeavesUtil(root.right, false);

        return leftSum + rightSum;
    }

    public static boolean isBalanced(TreeNode root) {

        int val = isBalancedUtil(root, 0);
        if (val == -1) {
            return true;
        }
        return false;
    }

    public static int isBalancedUtil(TreeNode root, int level) {

        if (root == null) return -1;


        int lBalanced = isBalancedUtil(root.left, level + 1);
        int rBalanced = isBalancedUtil(root.right, level + 1);

        if (Math.abs(lBalanced - rBalanced) <= 1) {
            return lBalanced;
        } else {
            return -1;
        }
    }

    public static boolean isSymmetric(TreeNode root) {

        return isSymmetricUtil(root.left, root.right);

    }

    public static boolean isSymmetricUtil(TreeNode leftTree, TreeNode rightTree) {

        if (leftTree == null && rightTree == null) return true;

        if (leftTree == null || rightTree == null) return false;

        if (leftTree.data != rightTree.data) return false;

        boolean lSymmetric = isSymmetricUtil(leftTree.left, rightTree.right);
        boolean rSymmetric = isSymmetricUtil(leftTree.right, rightTree.left);

        return lSymmetric && rSymmetric;
    }

    public static boolean isSameTree(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;


        if (root1.data != root2.data) return false;

        boolean ltree = isSameTree(root1.left, root2.left);
        boolean rtree = isSameTree(root1.right, root2.right);

        return ltree && rtree;

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

    public static boolean evaluateTree(TreeNode root) {

        if (root == null) return true;
        if (root.data == 0) return false;

        boolean leftValue = evaluateTree(root.left);
        boolean rightValue = evaluateTree(root.right);

        if (root.data == 2) return leftValue || rightValue;
        return leftValue && rightValue;

    }

    public static List<String> path(TreeNode root, TreeNode leaf) {

        List<String> list = new ArrayList<>();
        returnPath(root, leaf, list);
        return list;
    }

    public static void returnPath(TreeNode root, TreeNode leaf, List<String> list) {

        if (root == null) return;

        if (root.data == leaf.data) {
            list.add(root.data + "->");
        }

        returnPath(root.left, leaf, list);
        returnPath(root.right, leaf, list);

    }

    public static HashMap<Integer, Integer> frequency(TreeNode root) {

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        findFreq(root, hashmap);
        return hashmap;
    }

    public static void findFreq(TreeNode root, HashMap<Integer, Integer> hashmap) {

        if (root == null) return;

        if (hashmap.containsKey(root.data)) {
            int freq = hashmap.remove(root.data);
            freq++;
            hashmap.put(root.data, freq);
        } else {
            hashmap.put(root.data, 1);
        }

        findFreq(root.left, hashmap);
        findFreq(root.right, hashmap);

    }


}

class Node {
    int level;

}


