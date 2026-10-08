# 🟢 009. Palindrome Number

**Platform:** LeetCode
**Problem:** [LeetCode 9 - Palindrome Number](https://leetcode.com/problems/palindrome-number/)
**Difficulty:** Easy
**Pattern:** Math / Half-Number Reversal

---

## 📌 Problem

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise. Solve without converting integer to string.

---

## 💻 Java Solution

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(\log_{10} n)$
- **Space Complexity:** $O(1)$
