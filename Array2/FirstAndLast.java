
public class FirstAndLast {
public static void main(String[] args) {
int arr[]={1,2,5,3,6,3,9,9};
int target=1;
int first=0;
int last=0;
int result1=firstindex(arr, target, first);
int result2=lastindex(arr, target, last);
System.out.println(result1);
System.out.println(result2);

   }
   public static int firstindex(int arr[],int target,int first){
    for(int i=0;i<arr.length;i++){
        if(target==arr[i]){
            first=i;
        }
    }
    return first;
   }
     
   public static int lastindex(int arr[],int target,int last){
       for(int i= arr.length-1;i>=0;i--){
        if(target==arr[i]){
            target=i;
        }
     }
     return target;
      }
    }