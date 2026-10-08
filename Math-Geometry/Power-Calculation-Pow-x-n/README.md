# 🟡 050. Pow(x, n)

**Platform:** LeetCode
**Problem:** [LeetCode 50 - Pow(x, n)](https://leetcode.com/problems/powx-n/)
**Difficulty:** Medium
**Pattern:** Math / Binary Exponentiation

---

## 📌 Problem

Implement `pow(x, n)`, which calculates $x$ raised to the power $n$ ($x^n$).

---

## 💻 Java Solution

```java
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        double currentProduct = x;

        while (N > 0) {
            if ((N % 2) == 1) result *= currentProduct;
            currentProduct *= currentProduct;
            N /= 2;
        }
        return result;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(\log n)$
- **Space Complexity:** $O(1)$
