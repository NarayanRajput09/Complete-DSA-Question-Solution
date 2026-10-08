public class PatternNa30{


    public static void main(String [] args){
        int n = 5 ;
        int ptr = n;
       
        for(int row = 1 ; row <= n ; row++){
            int print = 1;
            for(int pt = 1 ; pt <= ptr ; pt++){
                System.out.print("  " + print + "  ");
                print++;
               
            }
            System.out.println();
            ptr--;
        }
    }
}