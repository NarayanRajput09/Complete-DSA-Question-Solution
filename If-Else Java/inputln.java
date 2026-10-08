
import java.util.*;

public class inputln {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the user name");
        
        String name =sc.next();

        System.out.println("Enter the user age name");

        int age =sc.nextInt();
    
        System.out.println("Enter the gender of user ");

        char ch = sc.next().charAt(0);
     
       System.out.println("Enter the double input ");

       double db = sc.nextDouble();

       System.out.println("The name of user is"+ name);
        System.out.println(" user age is"+ age);

                     System.out.println("gender is"+ ch);

                            System.out.println("double "+ db);




    }
}
