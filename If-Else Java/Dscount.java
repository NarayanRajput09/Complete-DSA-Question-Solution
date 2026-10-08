import java.util.*;

public class Dscount {
//     20) When purchasing certain items, a discount of 10% is offered if the 
// quantity purchased is more than 100. If quantity and price per item are input 
// through the keyboard, write a program to calculate the total expense

public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int price = sc.nextInt();
int quantity = sc.nextInt();

int totalExpense = price*quantity;

if(quantity >= 100){
System.out.print(totalExpense*0.9);
}else{
    System.out.print(totalExpense);

}

}

}

