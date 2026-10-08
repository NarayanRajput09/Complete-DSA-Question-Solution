class dynamicQueue {

    int[] arr;
    int size;

    dynamicQueue() {
        arr = new int[2];
        size = 0;
    }

    public void add(int ele) {

        if (size == arr.length) {

            int[] newArr = new int[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        arr[size] = ele;
        size++;
    }

    public int remove() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int ele = arr[0];

        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }

        size--;

        return ele;
    }

    public int peek() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[0];
    }

    public void display() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

    public class ImplementQueue {

    public static void main(String[] args) {

        dynamicQueue q = new dynamicQueue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.display();

        System.out.println("Removed: " + q.remove());

        q.display();

        System.out.println("Front: " + q.peek());
    }
}