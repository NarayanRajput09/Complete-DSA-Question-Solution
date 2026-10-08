# 🟡 002. Add Two Numbers

**Platform:** LeetCode
**Problem:** [LeetCode 2 - Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)
**Difficulty:** Medium
**Pattern:** Linked List Traversal / Elementary Math Simulation

---

## 📌 Problem

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

---

## 💡 Intuition

Dono lists reverse order me di gayi hain (Least Significant Digit pehle hai). Iska matlab hum standard addition (digit by digit with carry) directly start se end tak simulate kar sakte hain.

---

## 🧠 Approach

1. Create a `dummyHead` node to simplify list building.
2. Initialize `carry = 0`.
3. Loop while `l1 != null`, `l2 != null`, or `carry != 0`:
   - `sum = val1 + val2 + carry`.
   - `carry = sum / 10`.
   - Add new node with `sum % 10` to result list.
   - Advance pointers.
4. Return `dummyHead.next`.

---

## 💻 Java Solution

```java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(\max(m, n))$
- **Space Complexity:** $O(\max(m, n))$
