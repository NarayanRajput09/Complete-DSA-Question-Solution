# 🟡 046. Permutations

**Platform:** LeetCode
**Problem:** [LeetCode 46 - Permutations](https://leetcode.com/problems/permutations/)
**Difficulty:** Medium
**Pattern:** Backtracking / State Exploration

---

## 📌 Problem

Given an array `nums` of distinct integers, return all the possible permutations. You can return the answer in any order.

---

## 💻 Java Solution

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, current, used, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n! 	imes n)$
- **Space Complexity:** $O(n)$ recursion stack
