
import java.util.*;

// write a program to check wheather the triangle is equilatrel, isocless,or scalene triangle.

public class EqlsSc {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter side of triangle");
        System .out.println("a");
        int a = sc.nextInt();
                System .out.println("b");
        int b = sc.nextInt();
                System .out.println("c");
        int c = sc.nextInt();
       
        if (a==b){
            if(b==c){
                System.out.println("Equalitrail");
                }else{
                                System.out.println("isocless");

                }
                            }else if(a!=b){
                      if(b==c){
                                System.out.println("isocless");

                      }else{
                                System.out.println("scaller");

                    }
           }else{
                            System.out.println("scaller");

        }

    }
    

    }
    
    

