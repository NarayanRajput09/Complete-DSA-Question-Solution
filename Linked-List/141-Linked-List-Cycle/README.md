# 🟢 141. Linked List Cycle

**Platform:** LeetCode
**Problem:** [LeetCode 141 - Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
**Difficulty:** Easy
**Pattern:** Floyd's Tortoise and Hare / Fast & Slow Pointers

---

## 📌 Problem

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

---

## 💻 Java Solution

```java
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
