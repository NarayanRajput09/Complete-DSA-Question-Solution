import java.util.*;
public class MuliplesOf5 {

    public static void main(String[] args){

        ///write a java  program to check wheather the given integer is a multiple of 5
        
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int rem = a % 5;
    if(rem == 0 ) System.out.println("yes");
    else System.out.println("No");


    }
    
}
