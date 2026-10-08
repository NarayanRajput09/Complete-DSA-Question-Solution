public class LastOccurance {

    public static int findLast(int arr[], int index, int key) {
        if (index == arr.length) {
            return -1;
        }

        int result = findLast(arr, index + 1, key);

        if (result != -1) {
            return result;
        }

        if (arr[index] == key) {
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 3, 9, 3};
        int key = 3;

        int result = findLast(arr, 0, key);

        if (result != -1) {
            System.out.println("Last occurrence at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}