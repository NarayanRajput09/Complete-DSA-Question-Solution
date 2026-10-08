    import java.util.Scanner;
public class RverseString {

    static String reverse(String str) {

        if (str.length()== 0) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed String: " + reverse(str));
    }
}

