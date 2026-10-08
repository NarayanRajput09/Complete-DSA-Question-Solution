public class Minimum {
     public static void main(String[] args) {
        // int arr [][]=new int[3][4];
        int arr2[][]={
            {1,2,3},{1,2,4,5,6},{1,2,3,4,5,6,7}
        };
        int min=Integer.MAX_VALUE;
          for(int i=0;i<arr2.length;i++){
           for(int j=0;j<arr2[i].length;j++){
            int ele =arr2[i][j];
            if(min>ele){
                min= ele;
                  }      }
           } 
           System.out.println(min);
}
}