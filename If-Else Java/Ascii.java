import java.util.*;
//
public class Ascii {
   public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the input value =");
    char ch = sc.next().charAt(0);

    int cv = (int) ch;

    if((cv>=65 && cv<=90)||(cv>=97 &&cv<=122)){
        System.out.println("Alphabet");
    }else{
        System.out.println("Not an alphabet");
    }
    
   } 
}
