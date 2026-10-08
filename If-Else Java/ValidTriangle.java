
import java.util.*;

//write a program to check to input all angle of  a triangle
//and check wheather it is valid or not.

public class ValidTriangle {

    public static void main(String[] args) {

//write a program to input all triangle and check wheather it is valid or not
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

int sumOfAngles = a + b+ c;
if( sumOfAngles == 180 ){

System.out.println("validTriangle");
}else{
   System.out.println("InvalidTriangle");
 

}

    }

    
}
