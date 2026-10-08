
import java.util.*;  
public class CheckAlpabet {
  
    public static void main(String[] args){

    
    //write a program to input alphabet and check wheater it is constant and vovels

   Scanner sc = new Scanner(System.in);

   char ch = sc.next().charAt(0);

  if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U'){
       System.out.println("vovel");
    
     } else{
      System.out.println("constant");
    }
    
          }
}