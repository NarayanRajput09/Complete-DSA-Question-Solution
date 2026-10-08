public class Solution {
    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("153 is Armstrong: " + isArmstrong(153));
        System.out.println("370 is Armstrong: " + isArmstrong(370));
    }
}
