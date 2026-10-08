    public void addFirst(int data) {

    Node newNode = new Node(data);

    class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinklist {
    Node head;
    Node tail;
    int size;

    MyLinklist() {
        head = null;
        tail = null;
        size = 0;
    }
}
    }
