public class LinkedListPracticeQ4 {
    public static Node head;
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
    public void segregateEvenOdd(Node head) {
        Node prev = null;
        Node end = head, curr = head;
        while (end.next != null) {
            end = end.next;
        }
        Node new_end = end;
        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if (curr.data % 2 == 0) {
            this.head = curr;
                while (curr != end) {
                    if (curr.data % 2 == 0) {
                        prev = curr;
                        curr = curr.next;
                    } else {
                        prev.next = curr.next;
                        curr.next = null;
                        new_end.next = curr;
                        new_end = curr;
                        curr = prev.next;
                    }
                }
        } else {
            prev = curr;
        } 
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            new_end.next = end;
            end.next = null;
        }
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
        LinkedListPracticeQ4 ll = new LinkedListPracticeQ4();
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print(head);
        ll.segregateEvenOdd(head);
        ll.print(head);
    }
}
