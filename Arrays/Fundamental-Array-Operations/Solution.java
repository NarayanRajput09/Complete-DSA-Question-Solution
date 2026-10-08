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

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Max: " + findMax(arr));
        System.out.println("Min: " + findMin(arr));
        System.out.println("Second Max: " + findSecondLargest(arr));
        reverseArray(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
