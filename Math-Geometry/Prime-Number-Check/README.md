# 🟢 Prime Number Check

**Platform:** Standard DSA
**Difficulty:** Easy
**Pattern:** Math / Primality Test ($6k \pm 1$ Optimization)

---

## 📌 Problem

Determine whether a given integer $n$ is a prime number.

---

## 💻 Java Solution

```java
public class Solution {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(\sqrt{n})$
- **Space Complexity:** $O(1)$
