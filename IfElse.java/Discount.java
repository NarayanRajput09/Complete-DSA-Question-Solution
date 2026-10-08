import java.util.*;
// 20) When purchasing certain items, a discount of 10% is offered if the 
// quantity purchased is more than 100. If quantity and price per item are input 
// through the keyboard, write a program to calculate the total expenses 

public class Discount {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int price=sc.nextInt();
    int quantity =sc.nextInt();

    int totalExpense=price*quantity;
    int off=totalExpense/10;
     int discount=totalExpense-off;
    if(quantity>100){
        System.out.println("To Pay"+discount);
    }else{
        System.out.println("To Pay"+discount);
 
    }
   } 
}
