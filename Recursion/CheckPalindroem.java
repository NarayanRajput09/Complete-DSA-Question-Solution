public class CheckPalindroem {
public static void main(String[] args) {
        System.out.println(checkPalindrome2("RADAR"));
    }

    public static boolean checkPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        String rem = str.substring(1, str.length() - 1);
        boolean remRes = checkPalindrome(rem);
        return remRes;

    }

    public static boolean checkPalindrome2(String str) {
        return helper(str, 0, str.length() - 1);
    }
    public static boolean helper(String str, int start, int end) {
        helper(str, start, end);
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        boolean remRes = helper(str, start + 1, end - 1);
        return remRes;

    }

}
