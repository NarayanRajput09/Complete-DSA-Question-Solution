public class patternNa24 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
          if(row==1||col==1||(row==((n/2)+1)&&col<=((n/2)+1))){
            System.out.print(" * ");
          }else{
                       System.out.print("   ");
 
          }
            }
            System.out.println();
        }
    }
}






