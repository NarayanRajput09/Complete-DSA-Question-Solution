import java.util.*;

// Write a program to create a simple calculator for calculating a two number calculations. 

public class Calculater {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value a =");
        int a = sc.nextInt();

        System.out.print("Enter the value b =");
        int b = sc.nextInt();

        System.out.print("Enter the operator =");
        char operator = sc.next().charAt(0);
      
         int sum = a+b;
         int sub = a-b;
         int multi = a*b;
         int div = a/b;

        if(operator == '+'){
            System.out.print("Sum =" + sum);
        }else if(operator == '-'){
        System.out.print("Sub =" + sub ); 
         }else if(operator =='*'){
         System.out.print("multi =" + multi);

         }else if(operator == '/'){
        System.out.print("div =" + div);

         }

    }
}
