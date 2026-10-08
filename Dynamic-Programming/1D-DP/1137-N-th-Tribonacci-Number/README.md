# 🟢 1137. N-th Tribonacci Number

**Platform:** LeetCode
**Problem:** [LeetCode 1137 - N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/)
**Difficulty:** Easy
**Pattern:** 1D Dynamic Programming / 3-State Sliding Window

---

## 📌 Problem

The Tribonacci sequence $T_n$ is defined as: $T_0 = 0, T_1 = 1, T_2 = 1$, and $T_{n+3} = T_n + T_{n+1} + T_{n+2}$ for $n \ge 0$. Given `n`, return the value of $T_n$.

---

## 💻 Java Solution

```java
class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int t0 = 0, t1 = 1, t2 = 1;
        for (int i = 3; i <= n; i++) {
            int t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }
        return t2;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
