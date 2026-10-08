
	// 7. How do you find the maximum element in an array in                  Java?

    public class MaximumArray {
    public static void main(String[] args) {
        int arr[]={1,2,5,6,8,9,10};
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Max<arr[i]){
                Max =arr[i];
            }
        }
      System.out.print(Max);
 }
}
