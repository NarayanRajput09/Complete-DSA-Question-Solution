public class Armstrong {
    // Write a program that asks the user to enter a number and then prints whether it is an Armstrong number or not using a loop.

    public static void main(String[]args){
        int n = 153;
        int sum =0;
        while(n>0){
            int ld=n%10;
            sum = sum +ld*ld*ld;
                    if(sum==0);

            n=n/10;
        }System.out.print(sum);

    }
}
