public class patternNa13 {
    public static void main(String[] args) {
        int n = 5;         
        int spc = n / 2;   
        int str = 1;       
       //row
        for (int row = 1; row <= n; row++) {

            //  spaces
            for (int nsp= 1; nsp<= spc; nsp++) {
                System.out.print("   ");
            }
            //  stars
            for (int st = 1; st <= str; st++) {
                System.out.print(" "+"*"+" ");
            }

            //  for upper and lower part
            if (row <= n / 2) {
                spc--;     
                str += 2;  
            } else {
                spc++;     
                str -= 2;  
            }

            System.out.println();
}
}
}
    

    

