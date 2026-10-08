// 19. 20. Find the second max in an array 


public class SecondMaxArray {
    public static void main(String[] args) {
        int arr[]={7,8,9,4,12,10};
        int max = Integer.MIN_VALUE;
                int smax = Integer.MIN_VALUE;

                for(int i=0;i<arr.length;i++){
                   int ele=arr[i];
                    if(max<ele){
                        smax=max;
                        max=ele;
                    }else if(smax<ele){
                        smax=ele;
                    }
                }
System.out.print(smax);
    }
}
