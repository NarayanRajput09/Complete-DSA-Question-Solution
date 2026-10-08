
	// 7. How do you find the maximum element in an array in                  Java?


public class MaxValue {
    
    public static void main(String[] args) {
        int[] arr={4,2,1,0,3,9,7,2};
     int  // int [] arr2={1,2,3,4,5,};
      max= Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max = arr[i];
        }
          }

        System.out.println(max);
}
    }

