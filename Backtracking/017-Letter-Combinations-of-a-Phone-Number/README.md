# 🟡 017. Letter Combinations of a Phone Number

**Platform:** LeetCode
**Problem:** [LeetCode 17 - Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
**Difficulty:** Medium
**Pattern:** Backtracking / Decision Tree Exploration

---

## 📌 Problem

Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

---

## 💡 Intuition

Har digit multiple letters ko map karta hai. Hum har position par available characters ke branches explore karte hain using recursive backtracking.

---

## 💻 Java Solution

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(4^n 	imes n)$ where $n$ is length of digits string
- **Space Complexity:** $O(n)$ recursion stack
