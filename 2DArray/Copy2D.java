public class Copy2D{
    public static void main(String[] args) {
        int arr1[][]={
            {1,5,6,2,4,7},{7,8,9,5,4},{7,8,5,6}
        };
        int[][] copy =  MakeCopy(arr1);
    
     for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[i].length; j++) {
                System.out.print(copy[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static int[][]MakeCopy(int[][]arr1){
           int[][]res =new int[arr1.length][];
           for(int i=0;i<arr1.length;i++){
             res[i] =new int[arr1[i].length];
            for(int j=0;j<arr1[i].length;j++){
                  res[i][j]=arr1[i][j];
                 
            }

        }    
        return res;
    }
}
  
         
         
    