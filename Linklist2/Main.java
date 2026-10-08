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

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {

        MyLinklist list = new MyLinklist();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.display();
    }
}