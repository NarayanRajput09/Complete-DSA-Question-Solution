
import java.util.*;
public class ReverseFor {
         // Write a program that takes a number from user and prints its reverse 
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n =6789;
        int sum=0;
        for(;n > 0;n= n /10){

        
           int ld=n%10;
         sum =sum*10+ld;
        
        }
       System.out.println(sum);
    }
    }