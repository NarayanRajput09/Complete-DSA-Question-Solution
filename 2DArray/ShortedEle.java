import java.lang.reflect.Array;

public class ShortedEle {
 
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 5, 3},
            {4, 5, 6, 8},
            {7, 8, 5, 2}
        };

          Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
         for (int j = 1; j < arr[i].length; j++) {
               System.out.print(arr[i][j]+" "); 
               
            }

           System.out.println();
        }

       
    }
}



