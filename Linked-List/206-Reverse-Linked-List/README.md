# 🟢 206. Reverse Linked List

**Platform:** LeetCode
**Problem:** [LeetCode 206 - Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
**Difficulty:** Easy
**Pattern:** In-place Pointer Reversal

---

## 📌 Problem

Given the `head` of a singly linked list, reverse the list, and return the reversed list.

---

## 💻 Java Solution

```java
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
