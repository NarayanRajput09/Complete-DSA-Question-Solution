# 🟢 867. Transpose Matrix

**Platform:** LeetCode
**Problem:** [LeetCode 867 - Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)
**Difficulty:** Easy
**Pattern:** 2D Matrix Transformation

---

## 📌 Problem

Given a 2D integer array `matrix`, return the transpose of `matrix`. The transpose flips the matrix over its main diagonal, switching row and column indices.

---

## 💻 Java Solution

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposed = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(m 	imes n)$
- **Space Complexity:** $O(m 	imes n)$
