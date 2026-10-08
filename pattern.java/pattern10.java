public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int str = 1;

        for(int row = 1; row <= 2*n - 1; row++) {

            for(int st = 1; st <= str; st++) {
                System.out.print("* ");
            }

            System.out.println();

            if(row < n) {
                str++;
            } else {
                str--;
            }
}
}
}

