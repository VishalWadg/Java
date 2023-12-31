public class LinkedListPracticeQ5 {
    public Node head;
    public Node tail;
    public int size;
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static Node sortedMerge(Node a, Node b) {
        Node result = null;
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
    public static Node mergeKLists(Node arr[], int last) {
        while (last != 0) {
            int i = 0;
            int j = last;
            while(i < j) {
                arr[i] = sortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if (i >= j) {
                    last = j;
                }
            }
        }
        return arr[0];
    }
    public void print(Node nd) {
        while (nd != null) {
            System.out.print(nd.data + "-");
            nd = nd.next;
        }
        System.out.println("null");
    }
    public static void main (String args[]) {
        LinkedListPracticeQ5 ll = new LinkedListPracticeQ5();
        int k = 2, n = 4;
        Node arr[] = new Node [k];
        arr[0] = new Node(1);
        arr[0].next = new Node(4);
        arr[0].next.next = new Node(6);
        arr[0].next.next.next = new Node(9);

        arr[1] = new Node(0);
        arr[1].next = new Node(2);
        arr[1].next.next = new Node(5);
        arr[1].next.next.next = new Node(7);
        Node res = mergeKLists(arr, k - 1);
        ll.print(res);
    }
}
class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
    }
}
