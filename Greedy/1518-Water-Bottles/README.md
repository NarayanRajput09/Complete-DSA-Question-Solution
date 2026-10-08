# 🟢 1518. Water Bottles

**Platform:** LeetCode
**Problem:** [LeetCode 1518 - Water Bottles](https://leetcode.com/problems/water-bottles/)
**Difficulty:** Easy
**Pattern:** Greedy / Simulation

---

## 📌 Problem

There are `numBottles` water bottles that are initially full of water. You can exchange `numExchange` empty water bottles from the market with one full water bottle. Return the maximum number of water bottles you can drink.

---

## 💡 Intuition

Jab tak hamare paas exchange threshold se zyada khali bottles hain, hum greedy way me max bottles exchange karte rahenge.

---

## 💻 Java Solution

```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            totalDrunk += newBottles;
            emptyBottles = (emptyBottles % numExchange) + newBottles;
        }
        return totalDrunk;
    }
}
```

---

## ⏱️ Complexity

- **Time Complexity:** $O(\log_{	ext{numExchange}}(	ext{numBottles}))$
- **Space Complexity:** $O(1)$
