# 🟢 Fundamental Array Operations

**Platform:** GeeksforGeeks / Standard DSA
**Difficulty:** Easy
**Pattern:** Linear Scan & Two Pointers

---

## 📌 Problem

Implementation of essential array algorithms:
1. Finding Maximum and Minimum elements.
2. Finding Second Largest and Second Smallest elements in a single pass.
3. In-place Array Reversal using two pointers.
4. Frequency calculation and duplicate filtering.

---

## 💻 Java Solution

```java
import java.util.Arrays;

public class Solution {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax && x != max) {
                secondMax = x;
            }
        }
        return secondMax;
    }

    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(1)$
