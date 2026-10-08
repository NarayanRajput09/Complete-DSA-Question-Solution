public class TowerOfHanoi {
    public static void main(String[] args) {
        printHanoi(3, "S", "H", "D");
    }

    public static void printHanoi(int n, String S, String H, String D) {
        if (n == 1) {
            System.out.println(n + "---" + S + "---> " + D);
            return;
        }
        printHanoi(n - 1, S, D, H);
        System.out.println(n + "---" + S + "---> " + D);
        printHanoi(n - 1, H, S, D);
    }
}
