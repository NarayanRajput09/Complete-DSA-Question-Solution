

import java.util.ArrayList;

public class PerMutation {

    public static void main(String[] args) {
        System.out.println(printPermuation3("abc"));
    }

    public static void printPermuation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1, str.length());
            printPermuation(rem, ans + ch);
        }
    }

    public static ArrayList<String> printPermuation2(String str, String ans) {
        ArrayList<String> list = new ArrayList<>();
        helper2(str, ans, list);
        return list;
    }

    public static void helper2(String str, String ans, ArrayList<String> list) {
        if (str.length() == 0) {
            list.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1, str.length());
            helper2(rem, ans + ch, list);
        }
    }

    public static ArrayList<String> printPermuation3(String str) {
        ArrayList<String> ans = new ArrayList<>();
        if (str.length() == 0) {
            ans.add("");
            return ans;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1, str.length());
            ArrayList<String> remPermutation = printPermuation3(rem);

            for (String p : remPermutation) {
                ans.add(ch + p);
            }
        }
        return ans;

    }
}
