public class SumOfNumber {
    // Write a program that asks the user to enter a number and then prints the sum of the digits 

    public static void main(String[]args){
        int n = 100;
        int sum =0;
        int i=1;
        while(i<=n){
            sum = sum+i ;
            System.out.println(sum);
            i++;
        }
    }
    
}
