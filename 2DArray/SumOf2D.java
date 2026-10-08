public class SumOf2D{
    public static void main(String[] args) {
        // int arr [][]=new int[3][4];
        int arr2[][]={
            {1,2,3},{1,2,4,5,6},{1,2,3,4,5,6,7}
        };
       
              int sum =0;

         for(int i=0;i<arr2.length;i++){
           for(int j=0;j<arr2[i].length;j++){
            sum = sum+arr2[i][j];
        }
        System.out.println(sum);
    }
} 
}