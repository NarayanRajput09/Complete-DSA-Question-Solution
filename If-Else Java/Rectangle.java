import java.util.*;

// you are given two integer that area the length and breadth of rectangle
//check wheather the area or perimeter is greather.
public class Rectangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter value of length =");
        int length = sc.nextInt();

        System.out.print("Enter value of Breadth =");
        int breadth = sc.nextInt();

        int area = length + breadth ;

        int perimeter = 2*(length + breadth);

        if(area > perimeter){
            System.out.println("Area is greater then perimetr.");
        }else{
                        System.out.println("perimeter is greater then perimetr.");

        }
    }
}
