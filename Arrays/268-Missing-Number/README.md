# 🟢 268. Missing Number

**Platform:** LeetCode
**Problem:** [LeetCode 268 - Missing Number](https://leetcode.com/problems/missing-number/)
**Difficulty:** Easy
**Pattern:** Math / XOR / Sum Formula

---

## 📌 Problem

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

---

## 💡 Intuition

$0$ se $n$ tak ka expected sum hota hai $rac{n(n+1)}{2}$. Expected sum se actual sum ko subtract karne par direct missing number mil jata hai.

---

## 🧠 Approach

1. Calculate `expectedSum = n * (n + 1) / 2`.
2. Compute `actualSum` of elements in `nums`.
3. Return `expectedSum - actualSum`.

---

## 💻 Java Solution

```java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$

---

## 🎯 Key Takeaways

- Gauss formula gives $O(1)$ expected sum calculation.
- XOR approach is an alternative to prevent overflow on very large integers.
