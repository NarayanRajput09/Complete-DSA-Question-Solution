
import java.util.*;
public class PrimeNumber {
   // Write a program that asks the user to enter a number and then checks whether it is a prime number using a loop.
public static void main(String[]args){

     Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
     boolean flag=true;
     for(int i=2;i<=n-1;i++){
    if(n%i ==0){
    flag =false;
    break;

   }
}
if(flag){
    System.out.println("prime number");
    }else{
    System.out.println("not a prime number");
    }
 }
}