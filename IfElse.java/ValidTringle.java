import java.util.*;
public class ValidTringle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int SumOfTringle = a+b+c;
        if(SumOfTringle==180){
            System.out.print("validtringle");
        }else{
            System.out.print("not a invalidtriangle");
        }
    }
}
