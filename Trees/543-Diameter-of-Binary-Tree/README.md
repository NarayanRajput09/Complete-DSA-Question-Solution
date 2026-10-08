# 🟢 543. Diameter of Binary Tree

**Platform:** LeetCode
**Problem:** [LeetCode 543 - Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/)
**Difficulty:** Easy
**Pattern:** Tree DFS / Bottom-up Post-Order Traversal

---

## 📌 Problem

Given the `root` of a binary tree, return the length of the diameter of the tree. The diameter is the length of the longest path between any two nodes in a tree.

---

## 💡 Intuition

Har node par longest path left subtree ki height aur right subtree ki height ka sum hota hai (`leftHeight + rightHeight`). Post-order traversal karke height return karte waqt global maximum update karte hain.

---

## 💻 Java Solution

```java
class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        height(root);
        return maxDiameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        int leftH = height(node.left);
        int rightH = height(node.right);

        maxDiameter = Math.max(maxDiameter, leftH + rightH);
        return 1 + Math.max(leftH, rightH);
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(h)$ where $h$ is tree height
