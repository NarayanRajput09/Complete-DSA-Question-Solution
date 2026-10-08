public class Solution {
    public static String compress(String str) {
        if (str == null || str.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) sb.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
            else sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Compressed: " + compress("aaaabbbbaaaaccc"));
        System.out.println("Toggled: " + toggleCase("Hey I LoVe You"));
    }
}
