public class removefirst {
    public int removeFirst() {

    
    if (head == null) {
        System.out.println("Linked List is empty");
        return -1;
    }

    
    if (head.next == null) {
        int data = head.data;
        head = null;
        tail = null;
        return data;
    }

    // remove first node
    int data = head.data;
    head = head.next;

    return data;
}

}
