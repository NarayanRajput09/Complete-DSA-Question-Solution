public class AverageValue {
    public static void main(String[] args) {
        int arr1[][] = {
            {1,2,5,3},{4,5,6,8},{7,8,5,2}
        };
        int sum =0;
     int count=0;
         for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr1[i].length;j++){
            sum = sum+arr1[i][j];
            count++;
        }
          double average = (double) sum / count;

        System.out.println("Average value = " + average);
    }
    }
}
