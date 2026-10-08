# 🟢 Selection Sort

**Platform:** Standard DSA
**Difficulty:** Easy
**Pattern:** Sorting / Minimum Element Selection

---

## 📌 Problem

Given an array of integers, sort the array in ascending order using the Selection Sort algorithm.

---

## 💻 Java Solution

```java
public class Solution {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(n^2)$
- **Space Complexity:** $O(1)$
