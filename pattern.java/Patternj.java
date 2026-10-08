public class Patternj {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==1||col==n/2+1||row==col/n+n ||){
                    System.out.print(" * ");
                }else{
                                        System.out.print("   ");

                }
            }
                                System.out.println() ;

        }
    }
}
