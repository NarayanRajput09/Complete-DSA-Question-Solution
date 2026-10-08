# 🟡 2181. Merge Nodes in Between Zeros

**Platform:** LeetCode
**Problem:** [LeetCode 2181 - Merge Nodes in Between Zeros](https://leetcode.com/problems/merge-nodes-in-between-zeros/)
**Difficulty:** Medium
**Pattern:** Linked List Traversal & Chunk Aggregation

---

## 📌 Problem

You are given the `head` of a linked list, which contains a series of integers separated by `0`s. The beginning and end of the linked list will have `Node.val == 0`. Merge all nodes between every two consecutive `0`s into a single node whose value is the sum of all merged nodes.

---

## 💻 Java Solution

```java
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode currentResult = dummy;
        ListNode curr = head.next;
        int currentSum = 0;

        while (curr != null) {
            if (curr.val == 0) {
                currentResult.next = new ListNode(currentSum);
                currentResult = currentResult.next;
                currentSum = 0;
            } else {
                currentSum += curr.val;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$ extra space
