# 🟢 125. Valid Palindrome

**Platform:** LeetCode
**Problem:** [LeetCode 125 - Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)
**Difficulty:** Easy
**Pattern:** Two Pointers / String Sanitization

---

## 📌 Problem

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.

---

## 💡 Intuition

String ke dono ends se traverse karenge. Non-alphanumeric characters ko skip karenge aur matching characters ko case-insensitively compare karenge.

---

## 💻 Java Solution

```java
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
