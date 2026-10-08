	// 11. How do you copy an array in Java?

import java.util.*;
public class CopArray {
    public static void main(String[] args) {
        int arr []={4,5,6,9,7};

        int result[]= MakeCopy(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] MakeCopy(int[]arr){
        int[] res=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        return res;
    }
}
