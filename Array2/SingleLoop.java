// 18. Write a Java program to find the maximum and minimum elements in an array using a single loop.


public class SingleLoop{
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,10,2};
        int Max=Integer.MIN_VALUE;
        int Min=Integer.MAX_VALUE;
        int i;
        for(i=0;i<arr.length;i++){
        if(Max<arr[i]){
            Max = arr[i];
                    System.out.print("Maximum value= "+Max);

        }else if(Min<arr[i]){
          Min = arr[i];

        }
        System.out.print("Maximum value= "+Max);

        }
    }
}