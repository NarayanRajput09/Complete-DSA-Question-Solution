# 🟢 Pattern Printing Suite

**Platform:** Standard DSA / Basic Fundamentals
**Difficulty:** Easy
**Pattern:** Nested Loops / Coordinate Geometry

---

## 📌 Problem

Comprehensive collection of geometric pattern printing algorithms (Square, Right Triangle, Inverted Triangle, Diamond, Number Pyramids).

---

## 💻 Java Solution

```java
public class Solution {
    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n^2)$
- **Space Complexity:** $O(1)$
