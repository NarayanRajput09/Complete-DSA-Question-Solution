import java.util.*;

public class MultipleFive {
  
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the value = ");

        int a = sc.nextInt();

        if(a%5==0){
            System.out.print("Multiple of five.");
        }else{
        System.out.print("Not a Multiple of five");
        }
    }

}
