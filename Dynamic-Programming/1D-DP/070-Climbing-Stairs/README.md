# 🟢 070. Climbing Stairs

**Platform:** LeetCode
**Problem:** [LeetCode 70 - Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
**Difficulty:** Easy
**Pattern:** 1D Dynamic Programming / Fibonacci State Transition

---

## 📌 Problem

You are climbing a staircase. It takes `n` steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

---

## 💡 Intuition

$n$-th step par pahunchne ke do raaste hain: ya toh $(n-1)$-th step se 1 step chadhkar, ya $(n-2)$-th step se 2 steps chadhkar. Isliye: $	ext{ways}(n) = 	ext{ways}(n-1) + 	ext{ways}(n-2)$.

---

## 💻 Java Solution

```java
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int prev2 = 1, prev1 = 2;

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
