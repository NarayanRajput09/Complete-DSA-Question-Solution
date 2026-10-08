
import java.util.*;
public class DayInMonth {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int month =sc.nextInt();
    int year=sc.nextInt();
    int Day =0;
    if(month==1){
        System.out.print("31");
    }else if(month==3){
        System.out.print("31");
    }else if(month==4){
        System.out.print("30");
    }else if(month==5){
        System.out.print("31");
    }else if(month==6){
        System.out.print("30");
    }else if(month==7){
        System.out.print("31");
    }else if(month==8){
        System.out.print("31");
    }else if(month==9){
        System.out.print("30");
    }else if(month==10){
        System.out.print("31");
    }else if(month==11){
        System.out.print("30");
    }else if(month==12){
        System.out.print("31");
    }else if(month==2){
        if((year % 400==0)||(year %  4== 0&&year % 1 != 0)){
            System.out.println("Day 29");
        }else{
                     System.out.println("Day 28");
   
        }
    }     else{

         System.out.println("Not a invalid month");
    }

    
                System.out.print(" Enter month " + month + " of year " + year + " = " + Day);
    
   } 
}
