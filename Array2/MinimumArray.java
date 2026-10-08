
	// 8. How do you find the minimum element in an array in Java?

public class MinimumArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,9,8,7};
        int Min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(Min>arr[i]){
                Min=arr[i];
            }
        }
        System.out.print(Min);
    }
}
