import java.util.Scanner;

public class Main {

    // Recursive function
    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        printNumbers(n - 1); // Recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}