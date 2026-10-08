public class BarChartArray {
    public static void main(String[] args) {
        int []arr={5,3,4,6,9,8};
        System.out.println("BarcChart REpresentation:\n");

        for(int i=0;i<arr.length;i++ ){
        System.out.print(arr[i]+"|"); 
          
        for(int j=0;j<arr[i];j++){
                 System.out.print("*"); 

        }
             System.out.println(); 
    }
    }
}
