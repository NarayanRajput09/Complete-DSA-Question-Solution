public class AllOccuransce {

    public static void findAll(int arr[], int index, int target) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            System.out.println("Find at index: " + index);
        }

        findAll(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 3, 9, 3};
        int target = 3;

        findAll(arr, 0, target);
    }
}   

