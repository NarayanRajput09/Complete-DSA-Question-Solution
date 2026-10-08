import java.util.*;

//A company hires a person if 
//if person is married
//if person is unmarried, male and above 30 years of age
////if person is unmarried, female and above 25 years of age

public class Hires {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Married States = ");
        char married = sc.next().charAt(0);
       
        System.out.print("Age =");
        int age = sc.nextInt();

        System.out.print("Gender =");
        char gender = sc.next().charAt(0);

        if(married == 'M' || married == 'm'){
            System.out.print("You are eligible for this job.");

        }else if((gender == 'M' || gender == 'm') && age >= 30){
           System.out.print("You are eligible for this job.");
     

        }else if((gender=='F'|| gender=='f')&&age>=25){ 
          System.out.print("You are eligible for this job.");

     }else{ 
                        System.out.print("You are not eligible for this job.");

     }
    }
}

        
    
    

