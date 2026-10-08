# 🟡 167. Two Sum II - Input Array Is Sorted

**Platform:** LeetCode
**Problem:** [LeetCode 167 - Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
**Difficulty:** Medium
**Pattern:** Two Pointers (Opposite Ends)

---

## 📌 Problem

Given a 1-indexed array of integers `numbers` that is already sorted in non-decreasing order, find two numbers such that they add up to a specific `target` number. Return the 1-based indices `[index1, index2]`. You must use $O(1)$ extra space.

---

## 💡 Intuition

Kyunki array sorted hai, hum start (`left`) aur end (`right`) par do pointers rakh sakte hain.
- Agar `sum < target`: Humein sum badhana hoga, toh `left++`.
- Agar `sum > target`: Humein sum kam karna hoga, toh `right--`.
- Agar `sum == target`: Answer mil gaya!

* **What are we trying to find?** 1-based indices of two elements summing to `target`.
* **What information do we need to maintain?** `left` and `right` boundary pointers.
* **Why does this approach work?** Sorted array guarantee karta hai ki pointers ko inward shift karne se sum strictly increase ya decrease hota hai.
* **How did we identify this pattern?** "Sorted Array" + "Target Pair Sum" + "$O(1)$ space requirement" -> Classic Two Pointers pattern.

---

## 🧠 Approach

1. Initialize `left = 0`, `right = numbers.length - 1`.
2. While `left < right`:
   - Calculate `sum = numbers[left] + numbers[right]`.
   - If `sum == target`, return `[left + 1, right + 1]`.
   - If `sum < target`, increment `left`.
   - If `sum > target`, decrement `right`.
3. Return empty array if not found.

---

## 💻 Java Solution

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}
```

---

## 🔍 Dry Run

Input: `numbers = [2, 7, 11, 15]`, `target = 9`

| Step | `left` (val) | `right` (val) | `sum` | Decision |
| :--- | :--- | :--- | :--- | :--- |
| 1 | 0 (2) | 3 (15) | 17 | $17 > 9 \implies 	ext{right--}$ |
| 2 | 0 (2) | 2 (11) | 13 | $13 > 9 \implies 	ext{right--}$ |
| 3 | 0 (2) | 1 (7) | 9 | $9 == 9 \implies$ Match! Return `[1, 2]` |

Result: `[1, 2]`

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$ — Each step shifts at least one pointer inward.
- **Space Complexity:** $O(1)$ — Only two integer pointer variables used.

---

## 🎯 Key Takeaways

- Sorted property eliminates the need for HashMap space.
- Shifting pointers inward reduces candidate space monotonically.

---

## 🧩 Pattern

**Pattern:** Two Pointers (Converging)
**Related:**
- 3Sum
- 4Sum
- Container With Most Water

---

## 🔗 Related Problems

- 001. Two Sum
- 015. 3Sum
- 011. Container With Most Water

---

## 🎤 Interview Explanation

"I will solve this problem using the Two Pointers technique from opposite ends.

The main idea is to start with pointers at the smallest and largest elements.

First, I initialize `left = 0` and `right = n - 1`.

Then, if the current pair sum is less than target, I move `left` forward to increase the sum. If the sum is greater, I move `right` backward to decrease it.

Finally, when the sum matches target, I return the 1-indexed pair `[left + 1, right + 1]`.

The time complexity is $O(n)$ and space complexity is $O(1)$."
