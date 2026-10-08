
import java.util.*;
public class AreaOfParameter {
//     // 16 ) You are given two integers that are the length and breadth of the rectangle. 
// Check whether the area or perimeter is greater  
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int length=sc.nextInt();
    int breadth = sc.nextInt();

    int Parameter= 2*(length+breadth);
    int Area = length+breadth;
     if(Area>Parameter){
System.out.print("Area is greater than parameter");
       }else{
System.out.print("parameter is greater than Area");

     }
   } 
}
