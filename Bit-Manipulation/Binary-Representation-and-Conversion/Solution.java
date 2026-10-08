public class Solution {
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public static int binaryToDecimal(String s) {
        int decimal = 0;
        int power = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                decimal += power;
            }
            power *= 2;
        }
        return decimal;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // Brian Kernighan's Algorithm
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("29 in Binary: " + decimalToBinary(29));
        System.out.println("11101 in Decimal: " + binaryToDecimal("11101"));
        System.out.println("Set bits in 29: " + countSetBits(29));
    }
}
