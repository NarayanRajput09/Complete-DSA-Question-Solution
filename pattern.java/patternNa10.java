public class patternNa10 {
    public static void main(String[] args) {
        int n=5;
        int nst=1;
        int nsp=n-1;
        //row
        for(int row=1;row<=(2*n-1);row++){
        
            //space
            for(int sp=1;sp<=nsp;sp++){
                System.out.print("   ");
            }
            //star
            for(int st=1;st<=nst;st++){
                System.out.print(" * ");
            }
            if(row<n){
                nst++;
                nsp--;
            }else{
            nsp++;
            nst--;

            }
            System.out.println();
        }
    }
}
