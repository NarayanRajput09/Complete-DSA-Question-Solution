import java.util.*;

public class checkAlphabet {
    
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt('0');

        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("vovel");
        }else{
            System.out.println("consonets");
        }
    }
}
