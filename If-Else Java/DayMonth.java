import java.util.*;
//) Write a Java program to find days in a month (Take input of Year and month 
//number.) 
public class DayMonth{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int month =sc.nextInt();
        int year =sc.nextInt();
        int day =0;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month ==11){
            System.out.print("Day 31");
        }else if(month == 4 || month == 6 || month == 8 || month == 10 || month == 12){
                       System.out.print("Day 30");
 
        }else if(month == 2){
            if((year % 400 == 0)||(year % 4 == 0 && year % 400 != 0 )){
                            System.out.print("Day 29");

            }else{
                            System.out.print("Day 28");

            } 

            
        }else{
                        System.out.print("not a invalid month!");

        }
                System.out.print(" Enter month " + month + " of year " + year + " = " + day);

    }
}