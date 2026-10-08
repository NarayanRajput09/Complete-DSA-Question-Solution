
import java.util.*;

public class Younger {
    public static void main (String[]args){

    
Scanner sc = new Scanner(System.in);

System.out.print("Enter age Ram = ");
int ram = sc.nextInt();
    
System.out.print("Enter age Shyam =");
int shyam =sc.nextInt();

System.out.print("Enter age Ajay =");
int ajay = sc.nextInt();

if(ram>shyam && ram>ajay){
    System.out.print("ram is youngest ");
}else if(shyam<ajay && shyam<ram){
    System.out.print(" ajay is youngest");

}else{
        System.out.print("shyam is youngest");



}
}
    
}
