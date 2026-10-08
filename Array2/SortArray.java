	// 9. How do you sort an array in Java?

import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int arr []={5,6,9,8,2,3,7};
         Arrays.sort(arr);
        
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
    }
}
