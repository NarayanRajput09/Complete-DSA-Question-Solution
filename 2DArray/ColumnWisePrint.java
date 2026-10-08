public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 4, 5, 6 },
                { 7, 8, 9, 10, 11 },
                { 12, 13, 14, 15, 16 },
        };
        // rowWise
        int maxSum = 0;
        int maxRow = 0;

        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                // System.out.print(arr[i][j]);
                rowSum += arr[i][j];
            }
            if (maxSum < rowSum) {
                maxSum = rowSum;
                maxRow = i;
            }
            System.out.println();
        }

        System.out.println(maxSum + "  " + maxRow);

        // Column wise
        // for (int j = 0; j < arr[0].length; j++) {

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i][j]);
        // }
        // System.out.println();
        // }

    }
}