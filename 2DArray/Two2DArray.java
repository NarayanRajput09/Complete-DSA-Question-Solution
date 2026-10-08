public class Two2DArray {
    public static void main(String[] args) {
        int arr1[][]={
            {2,5,6,4},{7,8,9,5},{7,2,4,6}
        };
        int arr2[][]={{2,5,6,4},{7,8,9,5},{7,2,4,6}};
         
        boolean flag=true;
       
           for(int i=0;i<arr1.length;i++){  //Row
            if(arr1[i].length!=arr2[i].length){
                flag=false;
                break;
            }
 
            
          for(int j=0;j<arr1[i].length;j++){ //coloum
                    if (arr1[i][j] != arr2[i][j]) {
                        flag=false;
               break;
                    }
          }
         
         
        }
         System.out.println(flag);
    }
}
