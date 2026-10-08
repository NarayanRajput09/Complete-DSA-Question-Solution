# 🟢 001. Two Sum

**Platform:** LeetCode
**Problem:** [LeetCode 1 - Two Sum](https://leetcode.com/problems/two-sum/)
**Difficulty:** Easy
**Pattern:** HashMap / Hash Table

---

## 📌 Problem

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

---

## 💡 Intuition

Humein do aise numbers dhoondhne hain jinka sum `target` ke barabar ho.
Har number `nums[i]` ke liye, humein check karna hai ki kya uska complement `(target - nums[i])` pehle dekha ja chuka hai.
HashMap use karke hum previous elements ko `O(1)` time me lookup kar sakte hain.

* **What are we trying to find?** Do numbers ke indices jinka sum target ho.
* **What information do we need to maintain?** Har visited number aur uska index HashMap me.
* **Why does this approach work?** Jab current number `x` aata hai, agar `target - x` map me hai, toh pair mil gaya!
* **How did we identify this pattern?** Pair sum lookup problems me complement check karne ke liye HashMap sabse optimal hota hai.

---

## 🧠 Approach

1. Initialize an empty HashMap storing `(number -> index)`.
2. Iterate through the array with index `i`.
3. Calculate `complement = target - nums[i]`.
4. If `complement` exists in the map, return `[map.get(complement), i]`.
5. Otherwise, put `(nums[i], i)` into the map.
6. Return empty array if no pair found.

---

## 💻 Java Solution

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
```

---

## 🔍 Dry Run

Input: `nums = [2, 7, 11, 15]`, `target = 9`

| Index `i` | `nums[i]` | Complement `(9 - nums[i])` | In Map? | Action | Map State |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 0 | 2 | 7 | No | Put (2:0) | `{2: 0}` |
| 1 | 7 | 2 | Yes (`index 0`) | Return `[0, 1]` | Result Found |

Result: `[0, 1]`

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$ — Single pass through array with $O(1)$ average hash table operations.
- **Space Complexity:** $O(n)$ — In worst case, storing $n$ elements in the HashMap.

Where $n$ is the number of elements in `nums`.

---

## 🎯 Key Takeaways

- Using a HashMap turns an $O(n^2)$ brute force into an optimal $O(n)$ single-pass solution.
- Always check for the complement before inserting current element to avoid using the same index twice.
- Hash lookup provides instant $O(1)$ presence check.

---

## 🧩 Pattern

**Pattern:** HashMap Lookup
**Related:**
- Two Pointers (when array is sorted)
- Complement Search
- Subarray Sum Equals K

---

## 🔗 Related Problems

- 167. Two Sum II - Input Array Is Sorted
- 015. 3Sum
- 018. 4Sum
- 560. Subarray Sum Equals K

---

## 🎤 Interview Explanation

"I will solve this problem using a HashMap for $O(1)$ constant time complement lookup.

The main idea is that for each element `nums[i]`, we calculate `complement = target - nums[i]`.

First, I initialize an empty map mapping value to index.

Then, iterating through `nums`, I check if `complement` is already in our map. If yes, I immediately return `[map.get(complement), i]`. Otherwise, I store `(nums[i], i)`.

Finally, the answer is returned in a single pass.

The time complexity is $O(n)$ and space complexity is $O(n)$."
