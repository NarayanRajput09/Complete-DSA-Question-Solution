# 🟡 003. Longest Substring Without Repeating Characters

**Platform:** LeetCode
**Problem:** [LeetCode 3 - Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
**Difficulty:** Medium
**Pattern:** Sliding Window (Dynamic Window)

---

## 📌 Problem

Given a string `s`, find the length of the longest substring without repeating characters.

---

## 💡 Intuition

Window ko expand karte hain right pointer se. Agar koi character duplicate ho jata hai, toh left pointer ko us duplicate ke next index par jump karwa dete hain using HashMap.

---

## 💻 Java Solution

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(\min(n, m))$ where $m$ is alphabet size.
