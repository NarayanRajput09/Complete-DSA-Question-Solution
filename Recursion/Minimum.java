public class Minimum {
        public static int findmin(int arr[],int n){
        if(n == 1){
            return arr[0];
        }

        int min = findmin(arr, n-1);

        if (arr[n - 1] < min) {
            return arr[n - 1];
        } else {
            return min;
        }

    }
    public static void main(String[] args) {
        int arr [] ={4,5,6,1,2,3};
        int n = arr.length;

        int result = findmin(arr, n);
        System.out.println("manimum element is :" + result);
    }
}



