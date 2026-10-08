public class patternNa33{
    public static void main(String [] args){
        int n = 5 ;
        int ptr = 1;
       
        for(int row = 1 ; row <= n ; row++){
            int print = 1 ;
            for(int pt = 1 ; pt <= ptr ; pt++){
                System.out.print("  " + print + "  ");
                if(row <= pt){
                    print--;
                }else{
                    print++;
                }
            }
            System.out.println();
            ptr += 2;
        }
    }
}
