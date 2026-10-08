
import java.util.*;

//write a program to check wheather a number is negative positive or zero
public class PositiveNegative {

  public static void main(String[] args) {
        
        //Take input of a number and wheather a program to chack wheather a number is
        //negative, positive or zero
            Scanner sc  = new Scanner(System.in);
                  System.out.println("Enter the number");


       int n =sc.nextInt();

       if(n>0){
        System.out.println("Positive");

       }else if (n<0){

       System.out.println("negative");

        }else{
          System.out.println("zero");
        }


  }
}
