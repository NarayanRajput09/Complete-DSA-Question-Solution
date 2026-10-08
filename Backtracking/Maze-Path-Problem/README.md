# 🟡 Maze Path Problem

**Platform:** Standard DSA
**Difficulty:** Medium
**Pattern:** Recursion / Path Exploration

---

## 📌 Problem

Given a grid of size $M 	imes N$, find all possible paths from top-left cell $(1, 1)$ to bottom-right cell $(M, N)$ moving only Right (Horizontal) and Down (Vertical).

---

## 💻 Java Solution

```java
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> paths = new ArrayList<>();
        if (sc < dc) {
            for (String p : getMazePaths(sr, sc + 1, dr, dc)) paths.add("H" + p);
        }
        if (sr < dr) {
            for (String p : getMazePaths(sr + 1, sc, dr, dc)) paths.add("V" + p);
        }
        return paths;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(2^{m+n})$
- **Space Complexity:** $O(m+n)$ recursion stack
