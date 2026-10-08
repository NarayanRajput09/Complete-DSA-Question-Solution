# 🟢 String Transformations and Compression

**Platform:** GeeksforGeeks / Standard DSA
**Difficulty:** Easy
**Pattern:** Two Pointers / Run-Length Encoding / Character Manipulation

---

## 📌 Problem

Implementation of standard string transformations:
1. Run-length string compression (e.g. `aaaabb` -> `a4b2`).
2. Case toggling (converting uppercase to lowercase and vice versa).
3. Capitalizing words and converting text to CamelCase.

---

## 💻 Java Solution

```java
public class Solution {
    public static String compress(String str) {
        if (str == null || str.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(n)$
