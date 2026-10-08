# 🟡 078. Subsets

**Platform:** LeetCode
**Problem:** [LeetCode 78 - Subsets](https://leetcode.com/problems/subsets/)
**Difficulty:** Medium
**Pattern:** Backtracking / Subsets & Subsequences

---

## 📌 Problem

Given an integer array `nums` of unique elements, return all possible subsets (the power set). The solution set must not contain duplicate subsets.

---

## 💻 Java Solution

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generate(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generate(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(2^n 	imes n)$
- **Space Complexity:** $O(n)$ recursion depth
