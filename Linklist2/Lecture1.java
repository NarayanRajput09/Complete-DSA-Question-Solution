



// implementation of Linklist





public class Lecture1 {
    public static void main(String[] args) {
        MyLinklist list = new MyLinklist();

        list.addfirst(10);
        list.addfirst(20);
        list.addLast(100);
        list.addLast(190);

        list.AddAtSpecificIndex(110, 2);
        list.AddAtSpecificIndex(110, 3);
        System.out.println(" before Deletion"+list);

        System.out.println(list.removeLast());
                System.out.println(list.removeLast());

                System.out.println("After Deletion"+list);


    }
}

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

    public void addfirst(int data) { // Add first
        Node n = new Node(data); // we have created node

        if (head == null) { // linklist is empty
            head = n;
            tail = n;
        } else {
            n.next = head;
            head = n;
        }
        size++;
    }

    public void addLast(int data) { // Add Last
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
            size = 1;

        } else {
            tail.next = n;
            tail = n;
        }
        size++;

    }

    public void AddAtSpecificIndex(int data, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Index is not invalid");
        } else if (idx == 0) {
            addfirst(data);
        } else if (idx == size) {
            addLast(data);
        } else {
            Node n = new Node(data);
            Node pre = head;
            while (idx - 1 > 0) {
                pre = pre.next;
                idx--;
            }
            Node nbr = pre.next;
            pre.next = n;
            n.next = nbr;
            size++;
        }
    }
    public int getFirst(){
        if(head == null){
            System.out.println("linklist is empty");
            return-1;
        }else{
            return head.data;
        }
    }

    public int getLast(){
        if(tail == null){
            System.out.println("linklist is empty");
            return-1;
        }else{
            return tail.data;
        }
    }
    public int getAtSpecificIndex(int idx){
        if(idx<0 ||idx>=size){
            System.out.println("Invalid index");
            return -1;
        }else if(idx == 0){
           return getFirst();

        }else if(idx == size-1){
           return getLast();
        }else{
            Node curr = head;
            while(idx>0){
                curr = curr.next;
                idx--;
            }
            return curr.data;
        }
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("LinkList is empty");
            return -1;
        }else if(head.next == null){
            int data = head.data;
            head = null;
            tail = head;
            size--;
            return data;
        }else{
               int data = head.data;
               head = head.next;
               size++;
               return data;

        }
    }
public int removeLast(){
    if(head == null){
            System.out.println("LinkList is empty");
            return -1;
        }else if(head.next == null){
            int data = head.data;
            head = null;
            tail = null;
            size--;
            return data;
        }else{
            int data = tail.data;
               Node curr = head;
               while(curr.next != tail){
                curr = curr.next;
               }
               curr.next = null;
               size--;
               
               tail = curr;
               return data;

        }
    }

    public String toString() {
        String str = "";
        Node curr = head;
        while (curr != null) {
            str = str + curr.data + " ";
            curr = curr.next;
        }
        return str;

    }
    public int length(){
        return size;
    }
}