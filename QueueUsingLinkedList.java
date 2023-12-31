public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }
        public static int peek () {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main (String args[]) {
        Queue qu = new Queue();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        while (!qu.isEmpty()) {
            System.out.println(qu.remove());
        }
    }
}
