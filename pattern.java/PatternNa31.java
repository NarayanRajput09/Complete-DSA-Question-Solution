public class PatternNa31 {

    public static void main(String [] args){
        int n = 5 ;
       
        for(int row = 1 ; row <= n-1 ; row++){
            int print = row + 1 ;
            int add = 4;
            for(int pt = 1 ; pt <= row + 1 ; pt++){
                System.out.print("  " + print + "  ");
                print = add + print ;
                add--;
            }
            System.out.println();
        }
    }
}


