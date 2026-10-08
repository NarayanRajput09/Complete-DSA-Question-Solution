# 🟡 054. Spiral Matrix

**Platform:** LeetCode
**Problem:** [LeetCode 54 - Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
**Difficulty:** Medium
**Pattern:** Matrix Simulation / Boundary Traversal

---

## 📌 Problem

Given an `m x n` matrix, return all elements of the matrix in spiral order.

---

## 💡 Intuition

Matrix ko chaar boundaries (`top`, `bottom`, `left`, `right`) ke andar traverse karna hai: Right -> Down -> Left -> Up, aur har step ke baad boundaries ko shrink karte jana hai.

---

## 🧠 Approach

1. Define 4 pointers: `top = 0`, `bottom = m - 1`, `left = 0`, `right = n - 1`.
2. While `top <= bottom` and `left <= right`:
   - Traverse `left` to `right` along `top` row, then increment `top`.
   - Traverse `top` to `bottom` along `right` column, then decrement `right`.
   - If `top <= bottom`, traverse `right` to `left` along `bottom` row, then decrement `bottom`.
   - If `left <= right`, traverse `bottom` to `top` along `left` column, then increment `left`.
3. Return the collected list.

---

## 💻 Java Solution

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) result.add(matrix[top][j]);
            top++;

            for (int i = top; i <= bottom; i++) result.add(matrix[i][right]);
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) result.add(matrix[bottom][j]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
                left++;
            }
        }
        return result;
    }
}
```

---

## 🔍 Dry Run

Input:
`[[1, 2, 3],`
 `[4, 5, 6],`
 `[7, 8, 9]]`

- Top row: 1, 2, 3 -> `top = 1`
- Right col: 6, 9 -> `right = 1`
- Bottom row: 8, 7 -> `bottom = 1`
- Left col: 4 -> `left = 1`
- Center: 5
Result: `[1, 2, 3, 6, 9, 8, 7, 4, 5]`

---

## ⏱️ Complexity

- **Time Complexity:** $O(m 	imes n)$
- **Space Complexity:** $O(1)$ (excluding output list)

---

## 🎯 Key Takeaways

- Shrinking boundary technique avoids visiting cells twice.
- Always add inner condition checks (`top <= bottom`, `left <= right`) before reverse traversal.

---

## 🧩 Pattern

**Pattern:** Boundary Shrinking Simulation

---

## 🔗 Related Problems

- 059. Spiral Matrix II
- 867. Transpose Matrix
- 498. Diagonal Traverse
