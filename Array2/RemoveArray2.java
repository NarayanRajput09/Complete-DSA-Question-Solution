public class RemoveArray2 {
    public static void main(String[] args) {
        int arr[]={4,5,6,9,8};
        int remove=arr[2];
        int count=0;
        //outerloop
     for(int i=0;i<arr.length;i++){
        //condition for inner 
        if(remove==arr[i]){
            for(int j=i;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            count=count+1;
          break;      
        }
        } if (count==0){
            System.out.println("element not found");
        }else{
                     System.out.println("element  found");
   
        }
    
        for(int i=0;i<arr.length-1;i++){

        System.out.print(arr[i]+" ");
    }
  }
}