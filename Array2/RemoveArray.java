	// 16. How do you remove an element from an array in Java?
    public class RemoveArray {
    public static void main(String[] args) {
        int[]arr={5,6,8,9,3,6};
        int remElement=3;   
        int count=0;
           for(int i=0;i<arr.length;i++){
            if (remElement==arr[i]){
            for(int j=i;j<arr.length-1;j++){
               arr[j]=arr[j+1];
                }
             count=count+1;
             break;
            }
        }
        if (count==0){
            System.out.println("element not found");
        }else{
                     System.out.println("element  found");
   
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
