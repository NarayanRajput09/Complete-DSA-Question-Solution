
// 30. Write a program to find the common elements between two arrays.

public class CommonEleArray30 {
 public static void main(String[] args) {
        int[] arr1 = { 9, 9, 7, 3, 6, 8 };
        int[] arr2 = { 9, 9, 8, 6, 5, 4 };

        for (int i = 0; i < arr1.length; i++) {
            int ele1 = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int ele2 = arr2[j];

                if (ele1 == ele2) {
                    System.out.println(ele1);
                    break;
                }
            }
        }
    }

}
