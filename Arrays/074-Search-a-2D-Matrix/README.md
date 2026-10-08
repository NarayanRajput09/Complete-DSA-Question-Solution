# 🟡 074. Search a 2D Matrix

**Platform:** LeetCode
**Problem:** [LeetCode 74 - Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)
**Difficulty:** Medium
**Pattern:** Binary Search / 2D Flattening

---

## 📌 Problem

Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix where each row is sorted in non-decreasing order and the first integer of each row is greater than the last integer of the previous row.

---

## 💡 Intuition

Kyunki matrix horizontally aur vertically strictly sorted hai, is pure $m 	imes n$ matrix ko ek single sorted 1D array ki tarah treat kiya ja sakta hai of length $m 	imes n$. Index mapping: `row = mid / n`, `col = mid % n`.

---

## 🧠 Approach

1. Total elements = $m 	imes n$.
2. Perform standard binary search with `low = 0` and `high = m * n - 1`.
3. Compute `mid = low + (high - low) / 2`.
4. Map `mid` to 2D coordinates `(mid / n, mid % n)`.
5. Compare value with `target` and update `low` or `high`.
6. Return `true` if found, `false` otherwise.

---

## 💻 Java Solution

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = matrix[mid / n][mid % n];

            if (val == target) return true;
            else if (val < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(\log(m 	imes n))$
- **Space Complexity:** $O(1)$

---

## 🎯 Key Takeaways

- Conceptual flattening maps 2D coordinates `[row][col]` to 1D index via `mid / cols` and `mid % cols`.

---

## 🧩 Pattern

**Pattern:** 2D Binary Search

---

## 🔗 Related Problems

- 240. Search a 2D Matrix II
- 704. Binary Search
