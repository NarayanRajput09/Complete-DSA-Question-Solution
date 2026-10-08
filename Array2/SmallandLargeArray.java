
// 17. Write a Java program to find the difference between the largest and smallest elements in an array.

public class SmallandLargeArray {
    public static void main(String[] args) {
        int arr[]={5,6,8,9,2,10};
        int  max= Integer.MIN_VALUE;
        int Min= Integer.MAX_VALUE;

      for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max = arr[i];
        }
          }

      for(int i=0;i<arr.length;i++){
        if(Min>arr[i]){
            Min = arr[i];
        }
          }
        System.out.println("Largevalue="+max);
        System.out.println("smallestValue="+Min);
}
}
    

