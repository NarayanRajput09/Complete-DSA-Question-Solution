# 🟢 203. Remove Linked List Elements

**Platform:** LeetCode
**Problem:** [LeetCode 203 - Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)
**Difficulty:** Easy
**Pattern:** Sentinel / Dummy Node

---

## 📌 Problem

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that have `Node.val == val`, and return the new head.

---

## 💻 Java Solution

```java
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
