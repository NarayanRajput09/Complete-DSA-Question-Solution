public class Itrate2D {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,5,6},{8,5,2,3},{7,8,9,5,6}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
