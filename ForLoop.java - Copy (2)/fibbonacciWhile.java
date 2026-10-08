  
//Write a program that prints the Fibonacci sequence up to a given number using a loop.
import java.util.*;

public class fibbonacciWhile {
        public static void main(String[]args){
                      Scanner sc = new Scanner(System.in);

                         int n = 5;

             int a = 0;
             int b = 1;
              int i=0;
             while(i<=n){

             
                System.out.println(a);
                int c = a+b;
                a=b;
                b=c;
                
                i++;
      }
  
  }
}
  

