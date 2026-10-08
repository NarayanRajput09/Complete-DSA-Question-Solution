public class PatternNa32{
    public static void main(String [] args){
        int n = 5 ;
       
        for(int row = 1 ; row <= n ; row++){
            for(int pt = 1 ; pt <= n ; pt++){
                if(pt == 1 || pt == n || row == n/2 +1 || row == 1 || row == n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
