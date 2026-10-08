public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int str = 1;
         int nsp=n-1;
        for(int row = 1; row <= 2*n - 1; row++) {

            for(int sp=1;sp<=nsp;sp++){
                System.out.print("  ");
            }
            for(int st = 1; st <= str; st++) {
                System.out.print("* ");
            }

            System.out.println();

            if(row < n) {
                str++;
               nsp--;
            } else {
                
                
                 str--;
                 nsp++;
            }
}
}
}



 

