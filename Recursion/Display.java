import java.util.Scanner;

public class Display {

    

    static void displayArray(int[] arr, int index) {

        if (index == arr.length) {
            return;
        }

        System.out.print(arr[index] + " ");

        displayArray(arr, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        displayArray(arr, 0);
    }
}