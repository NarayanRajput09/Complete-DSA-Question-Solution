

import java.util.*;
public class sumOfdigit {
    // Write a program that asks the user to enter a number and then prints the sum of the digits 
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n =6789;
        int sum=0;
        int i=0;
        while(i<=n){
         int ld=n%10;
         sum =sum+ld;
         n =n/10;
         i++;
        }
    
    System.out.print(sum);
    }
}
