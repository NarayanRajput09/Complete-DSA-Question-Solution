   
   
   import java.util.Arrays;
    public class CopyArray2 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 0, 3, 9, 7, 2 };

        int[] result = MakeCopy(arr);

        System.out.println(Arrays.toString(result));

    }

    public static int[] MakeCopy(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;

        // SpaceComplexity->O(n)
        // TimeComplexity->O(n)
    }
}

