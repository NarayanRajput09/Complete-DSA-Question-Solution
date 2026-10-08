# 🟡 328. Odd Even Linked List

**Platform:** LeetCode
**Problem:** [LeetCode 328 - Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/)
**Difficulty:** Medium
**Pattern:** Multi-Pointer List Partitioning

---

## 📌 Problem

Given the `head` of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

---

## 💻 Java Solution

```java
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
