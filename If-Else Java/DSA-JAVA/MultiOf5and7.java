
import java.util.*;

public class MultiOf5and7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = 70;

        if(a%5 == 0){
            if(a%7 ==0){
                System.out.print("Yes ");
            }else{
                System.out.print(" No");
            }
        }else {
                System.out.print("No");

        }
    }
    
}
