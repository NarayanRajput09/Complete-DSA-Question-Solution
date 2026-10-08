public class SumOfDigit {
    public static void main(String[] args) {
        int n = 1693;

        int ans = sumOfDigits(n);
        System.out.println(ans);
    }

    public static int sumOfDigits(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        int remNumber = n / 10;
        int digit = n % 10;
        int remNumSum = sumOfDigits(remNumber);
        int sum = digit + remNumSum;
        return sum;
    }

    public static int numberOfDigits(int n) {
        if (n >= 0 && n <= 9) {
            return 1;
        }
        int remDigits = numberOfDigits(n / 10);
        return 1 + remDigits;
    }

}
