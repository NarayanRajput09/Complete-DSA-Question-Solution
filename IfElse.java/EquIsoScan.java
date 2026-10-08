import java.util.*;
public class EquIsoScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a==b)
          if(b==c){
            System.out.print("equilatrail");
            }else {
             System.out.print("Isosless");
            
        }else if(a!=b){
            if(b==c){
                System.out.print("isoscales");
            }else{
                System.out.print("Scaller");
            }
        }else{
            System.out.print("Scaller");
        }
    }

}