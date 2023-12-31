public class LinkedListPracticeQ3 {
    public Node head;
    public Node tail;
    public int size;
    public class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void swap(Node head, int key1, int key2) {
        Node prevX = null, currX = head;
        if (key1 == key2) {
            return;
        }
        while (currX != null && currX.data != key1) {
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null, currY = head;
        while (currY != null && currY.data != key2) {
            prevY = currY;
            currY = currY.next;
        }
        if (prevX == null || prevY == null) {
            return;
        }
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }
        if (prevY != null) {
           prevY.next = currX; 
        } else {
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    public void addLast (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = null;
        size++;
    }
    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main (String args[]) {
        LinkedListPracticeQ3 ll = new LinkedListPracticeQ3();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print(ll.head);
        ll.swap(ll.head, 3, 7);
        ll.print(ll.head);
    }
}
