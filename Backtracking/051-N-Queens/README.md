# 🔴 051. N-Queens

**Platform:** LeetCode
**Problem:** [LeetCode 51 - N-Queens](https://leetcode.com/problems/n-queens/)
**Difficulty:** Hard
**Pattern:** Backtracking / Constraint Satisfaction

---

## 📌 Problem

The $n$-queens puzzle is the problem of placing $n$ queens on an $n 	imes n$ chessboard such that no two queens attack each other. Return all distinct solutions.

---

## 💡 Intuition

Column by column queen place karenge. Har row position ke liye check karenge ki kya queen safe hai (row, upper diagonal, lower diagonal check). Safe hone par next column recursively process karenge.

---

## 💻 Java Solution

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        backtrack(0, board, result, n);
        return result;
    }

    private void backtrack(int col, char[][] board, List<List<String>> result, int n) {
        if (col == n) {
            result.add(construct(board));
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                backtrack(col + 1, board, result, n);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n) {
        for (int j = 0; j < col; j++) if (board[row][j] == 'Q') return false;
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) if (board[i][j] == 'Q') return false;
        for (int i = row, j = col; i < n && j >= 0; i++, j--) if (board[i][j] == 'Q') return false;
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) res.add(new String(row));
        return res;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n!)$
- **Space Complexity:** $O(n^2)$
