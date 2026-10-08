# 🟢 021. Merge Two Sorted Lists

**Platform:** LeetCode
**Problem:** [LeetCode 21 - Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
**Difficulty:** Easy
**Pattern:** Two Pointers / Dummy Node

---

## 📌 Problem

You are given the heads of two sorted linked lists `list1` and `list2`. Merge the two lists into one sorted list by splicing together the nodes of the first two lists. Return the head of the merged linked list.

---

## 💻 Java Solution

```java
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(m + n)$
- **Space Complexity:** $O(1)$
