# 🟢 Armstrong Number

**Platform:** GeeksforGeeks / Standard DSA
**Difficulty:** Easy
**Pattern:** Math / Digit Extraction & Powers

---

## 📌 Problem

Check if a given number $n$ of $k$ digits is equal to the sum of the $k$-th power of its digits.

---

## 💻 Java Solution

```java
public class Solution {
    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }
        return sum == original;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(\log_{10} n)$
- **Space Complexity:** $O(1)$
