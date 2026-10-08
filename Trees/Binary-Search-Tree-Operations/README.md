# 🟢 Binary Search Tree Operations

**Platform:** GeeksforGeeks / Standard DSA
**Difficulty:** Medium
**Pattern:** Binary Search Tree Invariant / In-order Traversal

---

## 📌 Problem

Comprehensive suite of BST operations:
1. BST insertion and search.
2. Finding minimum and maximum in BST.
3. Printing / collecting elements within range `[low, high]`.
4. Computing the median of a BST using inorder traversal.

---

## 💻 Java Solution

```java
import java.util.ArrayList;
import java.util.List;

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
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(h)$ for search/insert/min, $O(n)$ for range traversal
- **Space Complexity:** $O(h)$ recursion stack
