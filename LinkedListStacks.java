public class LinkedListStacks {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        static Node head = null;
        public static boolean isEmpty() {
            return head == null;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        public static int pop () {
            if (head == null) {
                return -1;
            }
            int temp = head.data;
            head = head.next;
            return temp;
        }
        public static int peek () {
            if (head == null) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.isEmpty());
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
        System.out.println(st.isEmpty());
    }
}
