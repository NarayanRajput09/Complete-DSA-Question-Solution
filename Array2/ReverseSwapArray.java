import java.util.*;
public class ReverseSwapArray {
   public static void main(String[]args) {
    int [] arr={1,5,9,6,4};
    // int n =arr.length;
    // int j=0;
    // for(int i=arr.length-1;i>=0;i--){
    //     System.out.println(i);
    //     rev[j]=arr[i];
    //     j++;

    int st=0;
    int end=arr.length-1;
    while(st<end){
int k=arr[st];
arr[st]=arr[end];
arr[end]=k;
st++;
end--;
    
    }
    System.out.println(Arrays.toString(arr));
    // for(int i=0;i<arr.length;i++){
    // System.out.print(arr[i]);}
    
   }
}
