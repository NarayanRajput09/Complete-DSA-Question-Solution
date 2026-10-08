public class OnlyDigit {
    public static void main(String[] args) {
        String str = "9891293304";

    }

    public static boolean checkDigits(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if (ch >= '0' && ch <= '9') {
            // continue;
            // } else {
            // return false;
            // }

            if (ch < '0' && ch > '9') {
                return false;
            }
         }
        return true;
    }
}