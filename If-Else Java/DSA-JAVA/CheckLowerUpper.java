import java.util.*;  


public class CheckLowerUpper {
    
    public static void main(String[] args) {
        
        // write a program to check whether
        //a charcter is uppercase or lowercase
         Scanner sc = new Scanner(System.in);
      
           char ch = sc.next().charAt(0);
      //1 convert to ASCII
      // ANS = TYPE CASTING

      int asciiVal = (int) ch;
      if (asciiVal >=97 && asciiVal <=122){
      System.out.println("lowercase");
      }else if (asciiVal >=65 && asciiVal <=90){
            System.out.println("uppercase");
      }
         

    }

}
