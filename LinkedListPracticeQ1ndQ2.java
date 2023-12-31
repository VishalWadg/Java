import javax.lang.model.element.TypeParameterElement;

public class LinkedListPracticeQ1ndQ2 {
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
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
    public void remove(int n) {
        Node temp = head;
        int i = 0;
        while (i < n - 1) {
            temp = temp.next;
        }
        size--;
        temp.next = temp.next.next;
    }
    public void nAfterM(Node head, int n, int m) {
       Node curr = head, t;
       int count;
       while(curr != null) {
        for (count = 1; count < m && curr != null; count++) {
            curr = curr.next;
        }
        if (curr == null) {
            return;
        }
        t = curr.next;
        for (count = 1; count <= n && t != null; count++) {
            t = t.next;
        }
        curr.next = t;
        curr = t;
       }
    }
    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static int size;
    public Node head;
    public Node tail;
    public int getIntersection(Node head1, Node head2) {
        while (head1 != null ) {
            Node temp = head2;
            while(temp != null) {
                if (head1 == temp) {
                    System.out.println("Intersection found !");
                    return temp.data;
                }
                temp = temp.next;
            }
            head1 = head1.next;
        }
        System.out.println("Intersection not found");
        return -1;
    }
    public static void main(String args[]) {
        LinkedListPracticeQ1ndQ2 ll = new LinkedListPracticeQ1ndQ2();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        // LinkedListPracticeQ1 ll1 = new LinkedListPracticeQ1();
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print(ll.head);
        int m = 2, n = 2;
        ll.nAfterM(ll.head, n, m);
        ll.print(ll.head);
        // System.out.printf("m = %d, n = %d \n" +"Linked list we have is :\n", m, n);
        // ll.tail.next = ll1.head.next.next;
        // int intersec = ll1.getIntersection(ll.head, ll1.head);
        // System.out.println("> " + intersec);

    }
}
