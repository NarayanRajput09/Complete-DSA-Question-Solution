import java.util.*;
//write a java program that three numbers
//and check all wheather all numbers are equal or not 
public class EquNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");

        System.out.print("First value = ");
        int a = sc.nextInt();

        System.out.print("Second value = ");
        int b = sc.nextInt();

        System.out.print("Third value = ");
        int c = sc.nextInt();

        if(a==b && a==c){
            System.out.println("All three value are equal.");
        

        }else{
                        System.out.println("All three value are not equal.");

        }

    }
    
}
