# 🟡 151. Reverse Words in a String

**Platform:** LeetCode
**Problem:** [LeetCode 151 - Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)
**Difficulty:** Medium
**Pattern:** Two Pointers / String Tokenization

---

## 📌 Problem

Given an input string `s`, reverse the order of the words. A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space. Return a string of the words in reverse order concatenated by a single space.

---

## 💻 Java Solution

```java
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(n)$
