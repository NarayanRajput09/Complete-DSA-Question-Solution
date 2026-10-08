# 🟢 027. Remove Element

**Platform:** LeetCode
**Problem:** [LeetCode 27 - Remove Element](https://leetcode.com/problems/remove-element/)
**Difficulty:** Easy
**Pattern:** Two Pointers / In-place Array Modification

---

## 📌 Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` in-place. Return the number of elements which are not equal to `val`.

---

## 💡 Intuition

Saare elements jo `val` ke equal nahi hain, unhe array ke starting me shift karna hai using a single pointer `k`.

---

## 🧠 Approach

1. Initialize `k = 0`.
2. Iterate `i` from 0 to `nums.length - 1`.
3. If `nums[i] != val`, copy `nums[k] = nums[i]` and increment `k`.
4. Return `k`.

---

## 💻 Java Solution

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
```

---

## 🔍 Dry Run

Input: `nums = [3, 2, 2, 3]`, `val = 3`
- `i = 0`: `nums[0] == 3` (skip)
- `i = 1`: `nums[1] != 3` -> `nums[0] = 2`, `k = 1`
- `i = 2`: `nums[2] != 3` -> `nums[1] = 2`, `k = 2`
- `i = 3`: `nums[3] == 3` (skip)
Result: `k = 2`, `nums = [2, 2, _, _]`

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$

---

## 🎯 Key Takeaways

- Two-pointer fast-slow technique for in-place overwriting.
- Avoids shifting elements multiple times.

---

## 🧩 Pattern

**Pattern:** Fast and Slow Pointer

---

## 🔗 Related Problems

- 026. Remove Duplicates from Sorted Array
- 283. Move Zeroes
