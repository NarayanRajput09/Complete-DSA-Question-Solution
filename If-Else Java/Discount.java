import java.util.*;

//when purchasing certainitems,a discount of 10% is offered if the quantitypurchased is more than100.
//if quantity and price per item are input through the keyboard , write a program to calculate the totol exep.

public class Discount {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity:");
        int quantity =sc.nextInt();

        System.out.print("Enter price:");
        int price =sc.nextInt();

        int total = quantity*price;
        int off = total/10;
        int discount =total - off;
        
        if (quantity >= 100){
            System.out.print("To pay:" +discount);
        }else{
            System.out.print("To pay:" +total);

        }
        }
    }
    

