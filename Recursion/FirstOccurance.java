public class FirstOccurance {

    public static int findFirst(int arr[], int index, int key) {
        if (index == arr.length) {
            return -1; 
        }

        if (arr[index] == key) {
            return index;
        }

        
        return findFirst(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 3, 9, 3};
        int key = 3;

        int result = findFirst(arr, 0, key);

        if (result != -1) {
            System.out.println("First occurrence at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

