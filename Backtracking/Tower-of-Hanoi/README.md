# 🟢 Tower of Hanoi

**Platform:** Standard DSA / GeeksforGeeks
**Difficulty:** Easy
**Pattern:** Divide and Conquer / Recursion

---

## 📌 Problem

Classic mathematical puzzle where we have 3 rods and $n$ disks. Objective is to move entire stack to destination rod following rules:
1. Only one disk can be moved at a time.
2. No larger disk may be placed on top of a smaller disk.

---

## 💻 Java Solution

```java
public class Solution {
    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(2^n)$
- **Space Complexity:** $O(n)$
