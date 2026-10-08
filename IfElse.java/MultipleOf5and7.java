import java.util.*;
public class MultipleOf5and7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int rem=n%n;
      if(rem==n%5){
        if(rem==n%7){
            System.out.print("yes");
        }else{
                       System.out.print("No");
 
        }

      }else{
                    System.out.print("No");

      }
    }
    
}
