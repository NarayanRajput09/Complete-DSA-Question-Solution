import java.util.*;

public class primewhile2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int num=2;
        while(num<=n){
            int i=2;
            boolean prime=true;
            while(i*i<=num){
                if(num% i==0){
                    prime=false;
                   
                    break;
                }
                 i++;
            }
            if(prime  == false);
                System.out.println(num);
                num++;
                
            }

        }
    }

