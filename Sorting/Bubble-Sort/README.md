# 🟢 Bubble Sort

**Platform:** Standard DSA
**Difficulty:** Easy
**Pattern:** Sorting / Adjacent Comparison & Swapping

---

## 📌 Problem

Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm.

---

## 💻 Java Solution

```java
public class Solution {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n^2)$ worst/average case, $O(n)$ best case (with swapped flag)
- **Space Complexity:** $O(1)$
