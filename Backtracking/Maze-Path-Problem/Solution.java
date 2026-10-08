import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> paths = new ArrayList<>();

        // Horizontal move
        if (sc < dc) {
            List<String> hPaths = getMazePaths(sr, sc + 1, dr, dc);
            for (String p : hPaths) paths.add("H" + p);
        }

        // Vertical move
        if (sr < dr) {
            List<String> vPaths = getMazePaths(sr + 1, sc, dr, dc);
            for (String p : vPaths) paths.add("V" + p);
        }

        return paths;
    }

    public static void main(String[] args) {
        System.out.println("Paths for 3x3: " + getMazePaths(1, 1, 3, 3));
    }
}
