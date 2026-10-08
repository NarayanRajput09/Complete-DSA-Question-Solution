

// Write a program that asks the user to enter a number and then prints all the even numbers from 0 to that number using a loop. 

import java.util.*;
public class PrintEvenNum {
    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int i=0;
      while(i<=n){
        System.out.println(i);
        i+=2;
      }
    }
}
