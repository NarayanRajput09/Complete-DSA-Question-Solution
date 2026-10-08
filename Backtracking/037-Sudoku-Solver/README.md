# 🔴 037. Sudoku Solver

**Platform:** LeetCode
**Problem:** [LeetCode 37 - Sudoku Solver](https://leetcode.com/problems/sudoku-solver/)
**Difficulty:** Hard
**Pattern:** Backtracking / State Space Search

---

## 📌 Problem

Write a program to solve a Sudoku puzzle by filling the empty cells with digits `1-9` such that every row, column, and $3 	imes 3$ sub-box contains all digits from `1-9` without repetition.

---

## 💡 Intuition

Khali cell dhundho, 1 se 9 tak ke digits try karo. Agar digit valid hai toh board pe place karo aur aage solve karo. Agar aage solution nahi milta toh reset (backtrack) karke agla digit try karo.

---

## 💻 Java Solution

```java
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, row, col, c)) {
                            board[row][col] = c;
                            if (solve(board)) return true;
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c) return false;
            if (board[i][col] == c) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(9^{81})$ worst-case theoretical bound, practically very fast due to heavy pruning.
- **Space Complexity:** $O(81) = O(1)$ board recursion stack.
