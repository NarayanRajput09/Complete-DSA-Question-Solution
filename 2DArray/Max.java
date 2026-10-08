public class Max {
   
     public static void main(String[] args) {
        // int arr [][]=new int[3][4];
        int arr2[][]={
            {1,2,3},{1,2,4,5,6},{1,2,3,4,5,6,7}
        };
        int max=Integer.MIN_VALUE;
          for(int i=0;i<arr2.length;i++){
           for(int j=0;j<arr2[i].length;j++){
            int ele =arr2[i][j];
            if(max<ele){
                max= ele;
                  }      }
           } 
           System.out.println(max);
}
}

