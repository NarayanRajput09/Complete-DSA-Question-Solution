
	// 10. How do you reverse an array in Java?

     import java.util.*;
     public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 8, 3, 9, 2, 7 };

        // ReverseSelf(arr);
        int[] ans = Reverse(arr);
       System.out.println(Arrays.toString(ans));
        }
         public static int[] Reverse(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            res[arr.length - 1 - i] = arr[i];
        }

        return res;

        // SpaceComplexity->O(n)
        // TimeComplexity->O(n)
    }
}