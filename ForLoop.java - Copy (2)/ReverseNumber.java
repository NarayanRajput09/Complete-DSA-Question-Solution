    

import java.util.*;
public class ReverseNumber {
    // Write a program that takes a number from user and prints its reverse 
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n =6789;
        int sum=0;
        while(n>0){
         int ld=n%10;
         sum =sum*10+ld;
         n =n/10;
        }
    
    System.out.print(sum);
    }
}


