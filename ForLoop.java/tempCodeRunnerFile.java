 import java.util.*;
  // Write a program that asks the user to enter a string and then prints the reverse of that string using a loop.
public class reversewhile{


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int length =str.length();
        String reversed="";
        int i=length-1;
        while(i>=0){
       char ch =str.charAt(i);
       reversed+=ch;
        System.out.println(reversed);
        i--;
          }
        }
        
        
    }
    

 