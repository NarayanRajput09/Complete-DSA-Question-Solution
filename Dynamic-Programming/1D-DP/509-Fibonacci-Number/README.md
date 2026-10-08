# 🟢 509. Fibonacci Number

**Platform:** LeetCode
**Problem:** [LeetCode 509 - Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
**Difficulty:** Easy
**Pattern:** 1D Dynamic Programming / Space Optimization

---

## 📌 Problem

The Fibonacci numbers form a sequence such that each number is the sum of the two preceding ones, starting from 0 and 1. Calculate $F(n)$.

---

## 💻 Java Solution

```java
class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
