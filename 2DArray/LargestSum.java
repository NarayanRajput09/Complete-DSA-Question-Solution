public class LargestSum {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 5, 3},
            {4, 5, 6, 8},
            {7, 8, 5, 2}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];   

            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

            sum += max; 
        }

        System.out.println("Sum of largest elements = " + sum);
    }
}

