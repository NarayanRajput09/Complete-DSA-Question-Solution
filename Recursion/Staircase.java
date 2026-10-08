import java.util.ArrayList;

public class Staircase {
    public static void main(String[] args) {
        
    
        System.out.println(stairs(5));
    }

    public static ArrayList<String> stairs(int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (n < 0) {
            return ans;
        }
        if (n == 0) {
            ans.add("");
            return ans;
        }

        ArrayList<String> onePath = stairs(n - 1);
        ArrayList<String> twoPath = stairs(n - 2);

        for (String p : onePath) {
            ans.add(1 + "" + p);
        }
        for (String p : twoPath) {
            ans.add(2 + "" + p);
        }

        return ans;

    }
    
}