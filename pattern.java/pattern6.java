public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        int nst =2*n-1;
        for(int row=1;row<=n;row++){

             for(int sp=1;sp<=row-1;sp++){
            System.out.print("   ");
        }
       for(int st=1;st<=nst;st++){
            System.out.print(" * ");
       }

                        System.out.println();
                        nst-=2;
    }
    }
}