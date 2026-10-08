import java.util.Scanner;

public class Rverse {

    // Recursive function
    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNumbers(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}
