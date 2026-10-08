# 🟢 026. Remove Duplicates from Sorted Array

**Platform:** LeetCode
**Problem:** [LeetCode 26 - Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
**Difficulty:** Easy
**Pattern:** Two Pointers / In-place Array Modification

---

## 📌 Problem

Given an integer array `nums` sorted in non-decreasing order, remove duplicates in-place such that each unique element appears only once. Return the number of unique elements `k`.

---

## 💡 Intuition

Array already sorted hai, toh saare duplicates adjacent honge. Hum ek write pointer `k` maintain karenge jo unique elements ki position track karega.

---

## 🧠 Approach

1. If array length is 0, return 0.
2. Initialize `k = 1`.
3. Loop `i` from 1 to `nums.length - 1`.
4. If `nums[i] != nums[i - 1]`, place `nums[k] = nums[i]` and increment `k`.
5. Return `k`.

---

## 💻 Java Solution

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
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

Input: `nums = [1, 1, 2]`
- `i = 1`: `nums[1] == nums[0]` (duplicate, skip)
- `i = 2`: `nums[2] != nums[1]` -> `nums[1] = 2`, `k = 2`
Result: `k = 2`, array becomes `[1, 2, _]`

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$

---

## 🎯 Key Takeaways

- In-place modification uses two pointers: read pointer and write pointer.
- Leveraging sorted property guarantees all duplicates are adjacent.

---

## 🧩 Pattern

**Pattern:** Two Pointers (Read & Write)

---

## 🔗 Related Problems

- 027. Remove Element
- 080. Remove Duplicates from Sorted Array II
- 283. Move Zeroes
