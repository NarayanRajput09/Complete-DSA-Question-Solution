public class Spring {
    public static void main(String[] args) {
          int[][] arr = {
                { 1, 2, 3,4},
                { 5, 6, 7,8},
                { 9,10,11,12},
                {13,14,15,16}
        };
       int colmin =0;
       int  colmax =arr[0].length-1;
       int rowmin =0;
       int rowmax = arr.length;

       int totalElement = arr.length*arr[0].length;
       int count =0;
       while(count<totalElement){

          for(int i=colmin;i<colmax && count<totalElement;i++){
            count++;
         System.out.print(arr[rowmin][i]);
          }
           System.out.println();

         for( int j=rowmin+1;j<rowmax && count<totalElement;j++){
            count++;
            System.out.print(arr[colmax][j]+" ");
        }
           System.out.println();
           for(int i=colmax-1; i>=colmin && count<totalElement;i--){
            count++;
            System.out.print(arr[rowmax][i]);
           }
           System.out.println();
           for(int j=rowmax-1;j>=colmax && count<totalElement;j--){
            count++;
            System.out.print(arr[colmin][j]);

           }
            System.out.println();

          }
    }

}