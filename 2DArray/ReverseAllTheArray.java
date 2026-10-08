public class ReverseAllTheArray {
    public static void main(String[] args) {
            int[][] arr = {
                { 1, 2, 4, 5, 6 },
                { 7, 8, 9, 10, 11 },
                { 12, 13, 14, 15, 16 },
        };
       for (int i=0;i<arr.length;i++){
        int []arr2=arr[i];
        System.out.println(arr2);
        ReverseSelf(arr2);
       }
       for (int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
            System.out.println(arr[i][j]+" ");

         }
          System.out.println();
       }
    }
    
}
