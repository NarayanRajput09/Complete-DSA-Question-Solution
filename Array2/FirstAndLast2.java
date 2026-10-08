

public class FirstAndLast2 {
public static void main(String[] args) {
        // How do you find the index of an element's first and last occurrences in an
        // array in Java?

        int[] arr = { 4, 2, 8, 1, 0, 3, 9, 7, 8, 2 };
        int ele = 8;

        // int FirstIndex = findFirstIndex(arr, ele);
        // int SecondIndex = findLastIndex(arr, ele);

    }

    public static int[] findFirstAndLAstIndex(int[] arr, int target) {
        int fi = -1;
        int li = -1;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (flag == true && target == ele) {
                li = i;
                fi = i;
                flag = false;
            } else if (target == ele) {
                li = i;
            }
        }
        int[] ans = { fi, li };
        return ans;
    }
}
//     public static int findFirstIndex(int[] arr, int target) {

//         for (int i = 0; i < arr.length; i++) {
//             int ele = arr[i];

//             if (ele == target) {
//                 return i;
//             }
//         }

//         return -1;
//     }

//     public static int findLastIndex(int[] arr, int target) {

//         for (int i = arr.length - 1; i >= 0; i--) {
//             int ele = arr[i];

//             if (ele == target) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }