
public class factorial2 {

    public static int calculate(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        int fact = calculate(n - 1);
        int factorial = n * fact;
        return factorial;
    }

    public static void main(String[] args){
        int n = 5;
        int ans = calculate(n);
        System.out.println(ans);
    }
}