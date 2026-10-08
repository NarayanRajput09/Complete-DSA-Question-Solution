
import java.util.*;

public class SubjectPrint {

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics");
        int physics = sc.nextInt();

        System.out.println("Enter marks of chemestry");
                int chemestry = sc.nextInt();

        System.out.println("Enter marks of biology");
                int biology = sc.nextInt();

        System.out.println("Enter marks of math");
                int math = sc.nextInt();

        System.out.println("Enter marks of computer");
                int computer = sc.nextInt();
         
           int sum = physics+chemestry+biology+math+computer;
           System.out.println("sum marks="+sum);
           double percentage =sum / 5.0;
           System.out.println("Percentage="+ percentage +"%");
         if(percentage >=90){
          System.out.println("Grade A");

         }     else if(percentage >=90) {
                    System.out.println("Grade A");

          } else if(percentage >=80){
            System.out.println("Grade B");

          }else if(percentage >=70){
            System.out.println("Grade C");

          }else if(percentage >=60){
                      System.out.println("Grade D ");

          }else if(percentage >=40){
            System.out.println("Grade E");
          }else {
                      System.out.println("Grade F");

          }
          sc.close();
        }
      }




                     



    

    
