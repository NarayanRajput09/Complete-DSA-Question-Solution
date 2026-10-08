# 🟢 977. Squares of a Sorted Array

**Platform:** LeetCode
**Problem:** [LeetCode 977 - Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)
**Difficulty:** Easy
**Pattern:** Two Pointers

---

## 📌 Problem

Given an integer array `nums` sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

---

## 💡 Intuition

Largest squares hamesha array ke extremes (leftmost negative number ya rightmost positive number) par honge. Two pointers use karke end se result array fill karenge.

---

## 💻 Java Solution

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int idx = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[idx--] = leftSq;
                left++;
            } else {
                result[idx--] = rightSq;
                right--;
            }
        }
        return result;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(n)$
