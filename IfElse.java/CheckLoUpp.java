import java.util.*;
public class CheckLoUpp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch= sc.next().charAt(0);
      int asscivalue=(int)ch;
     if(asscivalue>=97 && asscivalue<=122){
        System.out.print("lowercase");
     }else if(asscivalue>=65 && asscivalue<=90){
        System.out.print("uppercase");
     }

     
    }
}
