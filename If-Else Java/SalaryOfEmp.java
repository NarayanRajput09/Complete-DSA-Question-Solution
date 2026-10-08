import java.util.*;

// Write a program to input basic salary of an employee and calculate its 
// Gross salary according to following: 
// ● Basic Salary <= 10000: HRA = 20%, DA = 80% 
// ● Basic Salary <= 20000: HRA = 25%, DA = 90% 
// ● Basic Salary > 20,000: HRA = 30%, DA = 95%
 public class SalaryOfEmp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
      System.out.println("Gross of salary");
        int BS = sc.nextInt();
        
      
        if(BS <= 1000){
            System.out.print("2*BS");

        }else if(BS <= 20000){
            System.out.print("2.25* BS");
        }else{
            System.out.print("2.25*BS");
        }
        }
    }
    

