# 🟢 108. Convert Sorted Array to Binary Search Tree

**Platform:** LeetCode
**Problem:** [LeetCode 108 - Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)
**Difficulty:** Easy
**Pattern:** Divide and Conquer / Tree DFS

---

## 📌 Problem

Given an integer array `nums` where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

---

## 💡 Intuition

Height-balanced tree banane ke liye root hamesha array ka middle element hona chahiye. Left subarray recursively left subtree banayega aur right subarray right subtree banayega.

---

## 💻 Java Solution

```java
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);
        return root;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(\log n)$ (recursion stack for balanced tree)
