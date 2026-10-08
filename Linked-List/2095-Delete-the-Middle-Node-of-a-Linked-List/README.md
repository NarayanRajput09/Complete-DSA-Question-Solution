# 🟡 2095. Delete the Middle Node of a Linked List

**Platform:** LeetCode
**Problem:** [LeetCode 2095 - Delete the Middle Node of a Linked List](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)
**Difficulty:** Medium
**Pattern:** Fast & Slow Pointers

---

## 📌 Problem

You are given the `head` of a linked list. Delete the middle node, and return the `head` of the modified linked list.

---

## 💻 Java Solution

```java
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
