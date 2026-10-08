# 🟢 344. Reverse String

**Platform:** LeetCode
**Problem:** [LeetCode 344 - Reverse String](https://leetcode.com/problems/reverse-string/)
**Difficulty:** Easy
**Pattern:** Two Pointers / In-place Swapping

---

## 📌 Problem

Write a function that reverses a string given as an array of characters `s` in-place with $O(1)$ extra memory.

---

## 💻 Java Solution

```java
class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
