# 🟢 088. Merge Sorted Array

**Platform:** LeetCode
**Problem:** [LeetCode 88 - Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
**Difficulty:** Easy
**Pattern:** Two Pointers (From End)

---

## 📌 Problem

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`. Merge `nums2` into `nums1` as one sorted array in-place.

---

## 💡 Intuition

Agar hum start se merge karenge toh `nums1` ke elements overwrite ho jayenge. Isliye hum peeche se (end of `nums1`) largest elements place karte hue aage badhenge!

---

## 🧠 Approach

1. Pointers: `i = m - 1`, `j = n - 1`, `k = m + n - 1`.
2. Compare `nums1[i]` and `nums2[j]`, place the larger one at `nums1[k]`.
3. Decrement corresponding pointers.
4. Copy remaining elements of `nums2` if any.

---

## 💻 Java Solution

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(m + n)$
- **Space Complexity:** $O(1)$

---

## 🎯 Key Takeaways

- Backward two-pointer avoids needing extra auxiliary memory.

---

## 🧩 Pattern

**Pattern:** Reverse Two Pointers
