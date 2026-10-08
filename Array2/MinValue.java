
// 8. How do you find the minimum element in an array in Java?


    public class MinValue {
    public static void main(String[] args) {
        int[] arr={4,2,1,0,3,9,7,2};
       // int [] arr2={1,2,3,4,5,};
     int Min= Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
        if(Min>arr[i]){
            Min = arr[i];
        }
          }

        System.out.println(Min);
}
    }



