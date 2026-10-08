import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
                System.out.println(mazePath(0, 0, 2, 2));
    }

    public static ArrayList<String> mazePath(int sr, int sc, int dr, int dc) {
        ArrayList<String> ans = new ArrayList<>();
        if (sr > dr || sc > dc) {
            return ans;
        }
        if (sr == dr && sc == dc) {
            ans.add("");
            return ans;
        }

        ArrayList<String> dSteps = mazePath(sr + 1, sc, dr, dc);
        ArrayList<String> rSteps = mazePath(sr, sc + 1, dr, dc);

        for (String step : dSteps) {
            ans.add("D" + step);
        }
        for (String step : rSteps) {
            ans.add("R" + step);
        }

        return ans;


    }
}
