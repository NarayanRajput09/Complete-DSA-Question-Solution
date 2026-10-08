# 🟡 152. Maximum Product Subarray

**Platform:** LeetCode
**Problem:** [LeetCode 152 - Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
**Difficulty:** Medium
**Pattern:** Dynamic Programming / Kadane's Variant

---

## 📌 Problem

Given an integer array `nums`, find a subarray that has the largest product, and return the product.

---

## 💡 Intuition

Negative numbers se multiply hone par maximum minimum ban jata hai aur minimum maximum ban jata hai! Isliye humein har step pe both `maxProduct` aur `minProduct` maintain karna padta hai.

---

## 🧠 Approach

1. Maintain `maxProd`, `minProd`, and `result` initialized to `nums[0]`.
2. Loop through `nums` from index 1.
3. If current number is negative, swap `maxProd` and `minProd`.
4. Update `maxProd = max(curr, maxProd * curr)` and `minProd = min(curr, minProd * curr)`.
5. Update `result = max(result, maxProd)`.
6. Return `result`.

---

## 💻 Java Solution

```java
class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);
            result = Math.max(result, maxProd);
        }
        return result;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$

---

## 🎯 Key Takeaways

- Negative signs invert polarity, requiring dual tracking of min and max products.
