# 🟢 747. Largest Number At Least Twice of Others

**Platform:** LeetCode
**Problem:** [LeetCode 747 - Largest Number At Least Twice of Others](https://leetcode.com/problems/largest-number-at-least-twice-of-others/)
**Difficulty:** Easy
**Pattern:** Array Traversal / Maximum Tracking

---

## 📌 Problem

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, otherwise return -1.

---

## 💻 Java Solution

```java
class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                return -1;
            }
        }
        return maxIndex;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
