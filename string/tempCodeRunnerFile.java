public class CapitilizeString {
  
    public static void main(String[] args) {
        String str = "  Java is the world ";

        str = str.trim();
        char fc = str.charAt(0);
        if (fc >= 'a' && fc <= 'z') {
            fc = (char) (fc - 'a' + 'A');
        }
        String ans = fc + "";

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);

            if (pre == ' ' && curr != ' ' && curr >= 'a' && curr <= 'z') {
                curr = (char) (curr - 'a' + 'A');
            }
            ans += curr;
           }
        System.out.println(ans);
    }
}
