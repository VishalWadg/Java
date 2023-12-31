import javax.lang.model.util.ElementFilter;

public class DoublyLinkedList {
    public static Node head;
    public static int size;
    public static Node tail;
    public class Node {
        int data;
        Node next;
        Node previous;
        Node (int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
        size++;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        size++;
    }
    public void removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is Empty !");
            return;
        } else if(size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        head.previous = null;
    }
    public void removeLast() {
        if (size == 0) {
            System.out.println("Linked List is Empty !");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        tail = tail.previous;
        tail.next = null;
    }

    // Reverse A Doubly LinkedList
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.previous = next; 
            prev = curr;
            curr = next;
        }
        tail = head;     // tail and head interchanging
        head = prev;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        // dll.removeFirst();
        // dll.removeLast();
        dll.print();
        dll.reverse();           // reverse
        dll.print();
        // dll.removeFirst();
        // dll.removeLast();
        // dll.print();
    }
}
