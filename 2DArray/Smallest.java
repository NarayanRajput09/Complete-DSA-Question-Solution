public class Smallest {
   
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 5, 3},
            {4, 5, 6, 8},
            {7, 8, 5, 2}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];   

            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

            sum += min; 
        }

        System.out.println("Sum of smallest elements = " + sum);
    }
}



