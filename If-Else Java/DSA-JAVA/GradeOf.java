import java.util.Scanner;

public class GradeOf {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

          int hardness = sc.nextInt();
          double carbon = sc.nextDouble();
          int tensileStrength = sc.nextInt();


          boolean condition1 = hardness > 50;
          boolean condition2 = carbon > 0.7;
          boolean condition3 = tensileStrength > 5600;

        if (condition1 && condition2 && condition3){
            System.out.println("Grade 10");
        }else if(condition1 && condition2){
            System.out.println("Grade 9");
        }else if(condition3 && condition2){
            System.out.println("Grade 8");
        }else if(condition1 && condition3){
            System.out.println("Grade 7");
            }else if(condition1 || condition2 || condition3){
                System.out.println("Grade 6");

            }else{
                System.out.println("Grade 5");
            }
        }
    
        
    }
