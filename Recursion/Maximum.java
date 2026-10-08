public class Maximum {
    public static int findmax(int arr[],int n){
        if(n == 1){
            return arr[0];
        }

        int max = findmax(arr, n-1);

        if (arr[n - 1] > max) {
            return arr[n - 1];
        } else {
            return max;
        }

    }
    public static void main(String[] args) {
        int arr [] ={4,5,6,1,2,3};
        int n = arr.length;

        int result = findmax(arr, n);
        System.out.println("maximum element is :" + result);
    }
}

