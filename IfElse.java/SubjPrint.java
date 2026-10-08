
import java.util.*;
public class SubjPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics =sc.nextInt();
        int chemestry =sc.nextInt();
        int mathmatics =sc.nextInt();
        int  biology=sc.nextInt();
        int computer=sc.nextInt();
         
        int sum= physics+chemestry+biology+mathmatics+computer;
       System.out.println("sum marks="+sum);
        double percentage=sum/5.0;
        System.out.println("percentage="+percentage+"%");
       
        if(percentage>=90){
            System.out.println("Grade A");
        }else if(percentage>80){
            System.out.println("Grade B");
        }else if(percentage>70){
            System.out.println("Grade C");
        }else if(percentage>60){
            System.out.println("Grade D");
        }else if(percentage>40){
            System.out.println("Grade E");
        } else if(percentage>40){
            System.out.println("Grade F");
        }



    }
    
}
