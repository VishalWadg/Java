public class LinkedList3 {
    public static Node head;
    public static Node tail;
    // public static Node tail;
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node getMid(Node head) {
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is the mid
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL \n");
    }

    public void zigZag(Node head) {
        // 1. get mid
        Node mid = getMid(head);
        // 2. reverse left half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // 3. alt - merge i.e. zig-zag merge
        Node left = head;
        Node right = prev;
        Node lNext, rNext;
        while (left != null && right != null) {

            lNext = left.next;
            left.next = right; // Zig-Zag merge
            rNext = right.next;
            right.next = lNext;


            left = lNext;   // Updation 
            right = rNext; 
        }
    }
    public static void main(String args[]) {
        LinkedList3 ll = new LinkedList3();
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("Before ZigZaging the Linked-List : ");
        ll.print();
        ll.zigZag(head);
        System.out.println("After ZigZaging : ");
        ll.print();
    }
}
