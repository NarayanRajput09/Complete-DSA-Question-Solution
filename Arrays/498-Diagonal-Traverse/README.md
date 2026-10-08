# 🟡 498. Diagonal Traverse

**Platform:** LeetCode
**Problem:** [LeetCode 498 - Diagonal Traverse](https://leetcode.com/problems/diagonal-traverse/)
**Difficulty:** Medium
**Pattern:** Matrix Simulation / Diagonal Parity

---

## 📌 Problem

Given an `m x n` matrix `mat`, return an array of all the elements of the array in a diagonal order.

---

## 💡 Intuition

Diagonals me `row + col` sum constant hota hai. Jab sum even ho, direction up-right hoti hai. Jab sum odd ho, direction down-left hoti hai. Boundary hits par cleanly redirect karna hota hai.

---

## 💻 Java Solution

```java
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
            if ((row + col) % 2 == 0) {
                if (col == n - 1) row++;
                else if (row == 0) col++;
                else { row--; col++; }
            } else {
                if (row == m - 1) col++;
                else if (col == 0) row++;
                else { row++; col--; }
            }
        }
        return result;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(m 	imes n)$
- **Space Complexity:** $O(1)$ (excluding output array)
