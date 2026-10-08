import java.util.*;

//write a program to check wheather the given integer is a multiple of 5 and 7.

public class MultiOf57 {
    public static void main(String[]args){
        System.out.print("Enter value =");
                Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();

      if(a%5 == 0 && a%7 == 0){
      
         System.out.println("it's number is multiple of 5 and 7. ");

    }else if(a%5 == 0){
         System.out.println("it's number is multiple of 5. ");

    }else if(a%7 == 0){
             System.out.println("it's number is multiple of 7. ");

     }else{
             System.out.println("it's number is not multiple of 5 and 7. ");

            }
     
    

        }}