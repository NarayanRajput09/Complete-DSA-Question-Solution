    //  15. Write a program to find the power of a number 
        // Take two inputs. 

import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        
        int m=sc.nextInt();
        int n=sc.nextInt();

        int multi =1;

        for(int i=0;i<n;i++){
        multi =multi*m;
        }
        System.out.print("multi =" + multi);
        }
    }
    

