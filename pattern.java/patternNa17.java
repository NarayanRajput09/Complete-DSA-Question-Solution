import java.util.*;
public class patternNa17{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(col==n||col==1||row==col){
                    System.out.print(" * ");
                }else{
                                       System.out.print("   ");
 
                }
            }

            System.out.println();
        }
    }
}