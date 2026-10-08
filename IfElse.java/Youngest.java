import java.util.*;
public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ram=sc.nextInt();
        int ajay=sc.nextInt();
        int Shyam=sc.nextInt();

        if(Ram<ajay){
            if(Ram<Shyam){
            System.out.println("Ram is youngest");
            }else{
             System.out.println("Shyamc is youngest ");
 
            }

        }else if(ajay<Shyam){
            System.out.println("ajay is youngest");
        }else{
            System.out.println("Shyam is youngets");
        }

    }
}
