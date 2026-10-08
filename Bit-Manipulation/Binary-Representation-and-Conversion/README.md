# 🟢 Binary Representation and Bit Manipulation

**Platform:** Standard DSA
**Difficulty:** Easy
**Pattern:** Bit Manipulation / Brian Kernighan's Algorithm

---

## 📌 Problem

Essential bit manipulation and number system operations:
1. Decimal to Binary conversion.
2. Binary to Decimal conversion.
3. Counting set bits (Hamming Weight) using Brian Kernighan's Algorithm.

---

## 💻 Java Solution

```java
public class Solution {
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(\log n)$ / $O(	ext{set\_bits})$
- **Space Complexity:** $O(1)$
