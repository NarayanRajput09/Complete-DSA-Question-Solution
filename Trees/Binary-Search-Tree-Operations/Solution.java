import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    public static int findMin(TreeNode root) {
        if (root == null) return -1;
        while (root.left != null) root = root.left;
        return root.val;
    }

    public static void printRange(TreeNode root, int low, int high, List<Integer> res) {
        if (root == null) return;
        if (root.val > low) printRange(root.left, low, high, res);
        if (root.val >= low && root.val <= high) res.add(root.val);
        if (root.val < high) printRange(root.right, low, high, res);
    }

    public static double findMedian(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        int n = inorder.size();
        if (n == 0) return 0;
        if (n % 2 == 1) return inorder.get(n / 2);
        return (inorder.get((n - 1) / 2) + inorder.get(n / 2)) / 2.0;
    }

    private static void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }
}
