
import java.util.*;

// //15)  A company hires a person if  
// If person is married 
// if person is unmarried, male and above 30 years of age  
// if person is unmarried , female and above 25 years of the ages.
public class HiresPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char married = sc.next().charAt(0);
        int age = sc.nextInt();
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

        
    
    



