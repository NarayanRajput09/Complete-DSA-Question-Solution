import java.util.*;
// 25. Write a program to check if an array is sorted in ascending order.

public class ShortedArray9 {
   
    public static void main(String[] args) {
      int []arr={1,2,5,6};

        boolean res = check(arr);

        System.out.println(res);

    }

    public static boolean check(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = arr[i - 1];

            if (pre > curr) {
                return false;
            }
        }
    }
}