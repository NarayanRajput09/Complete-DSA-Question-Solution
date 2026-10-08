# 🔴 004. Median of Two Sorted Arrays

**Platform:** LeetCode
**Problem:** [LeetCode 4 - Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)
**Difficulty:** Hard
**Pattern:** Binary Search / Partitioning

---

## 📌 Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the median of the two sorted arrays. The overall run time complexity should be $O(\log(m+n))$.

---

## 💡 Intuition

Humein do sorted arrays ka median nikalna hai bina unhe merge kiye.
Humein smaller array par binary search karke aisa partition dhundhna hai jahan left half ke saare elements right half ke saare elements se chhote ya barabar ho.

---

## 🧠 Approach

1. Binary search on the smaller array `nums1`.
2. Partition both arrays such that left partition has `(m + n + 1) / 2` elements.
3. Check if `maxLeftX <= minRightY` and `maxLeftY <= minRightX`.
4. If valid partition found:
   - If total length is odd, median = $\max(	ext{maxLeftX}, 	ext{maxLeftY})$.
   - If total length is even, median = average of $\max(	ext{lefts})$ and $\min(	ext{rights})$.
5. Adjust binary search bounds accordingly.

---

## 💻 Java Solution

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((m + n) % 2 == 0) {
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        return 0.0;
    }
}
```

---

## 🔍 Dry Run

Input: `nums1 = [1, 3]`, `nums2 = [2]`
- Total elements = 3 (odd).
- Partition on `nums1`: `partitionX = 1`, `partitionY = 1`.
- `maxLeftX = 1`, `minRightX = 3`, `maxLeftY = 2`, `minRightY = +INF`.
- Condition `1 <= INF` and `2 <= 3` holds true.
- Median = $\max(1, 2) = 2.0$.

---

## ⏱️ Complexity

- **Time Complexity:** $O(\log(\min(m, n)))$
- **Space Complexity:** $O(1)$

---

## 🎯 Key Takeaways

- Binary searching over the smaller array minimizes search steps.
- Virtual partitioning avoids physically merging arrays.

---

## 🧩 Pattern

**Pattern:** Binary Search on Partition
**Related:** K-th Element of Two Sorted Arrays

---

## 🔗 Related Problems

- Search in Rotated Sorted Array
- K-th Element of Two Sorted Arrays

---

## 🎤 Interview Explanation

"I will solve this problem using Binary Search to find the correct partition across the two sorted arrays.

The main idea is to divide both arrays into left and right halves such that every element on the left is $\le$ every element on the right.

First, I ensure binary search runs on the smaller array for $O(\log(\min(m, n)))$ time.

Then, I adjust partition points using binary search until partition conditions are satisfied.

Finally, the median is computed directly from boundary values.

The time complexity is $O(\log(\min(m, n)))$ and space complexity is $O(1)$."
