public class LinkedList {
    public static Node head;
    public static Node tail;
    public static int size;
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add Functions 1) First 2) Last 3) In Middle i.e. at given index

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            addFirst(data);
            return;
        }
        if (idx == size) {
            addLast(data);
            return;
        }
        size ++;
        Node temp = head;
        int index = 0;
        while (index < idx - 1) {
            temp = temp.next;
            index ++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove Functions 1) from start 2) from end

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is Empty !");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }
    public void removeLast() {
        if (size == 0) {
            System.out.println("Linked list is Empty !");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < size - 2) {
            temp = temp.next;
            i++;
        }
        tail = temp;
        tail.next = null;
        size --;
    }

    // Recursive Search

    public int helpRecSearch(int key, Node heaNode) {
        if (heaNode == null) {
            return - 1; 
         }
         if (heaNode.data == key) {
             return 0;
         }
         int idx = helpRecSearch(key, heaNode.next);
         if (idx == -1) {
             return -1;
         }
         return idx + 1;
    }
    public int recursiveSearch(int key) {
        return helpRecSearch(key, head);
    }

    // Reversing the Linked-List

    public void reverse() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Remove Nth Node from the End of the Linked-List

    public void removeNthFromEnd(int n) {
        if (n == size ) {
            removeFirst();
            return;
        }
        Node temp = head;
        int i = 1;// prev
        while (i < size - n) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    // Check if the Linked-List is Palindrome

    public Node findMid(Node head) {// Fast-Slow approach
        Node fast = head.next;
        Node slow = head; 
        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // Slow is the mid-Node
    }

    public boolean isPalindrome() {
        if (size == 1) {
            return true;
        }
        // step 1 find mid
        Node mid = findMid(head);
        //reverse the right half
        Node prev = null;
        Node curr = mid;
        Node nextNode;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        Node right = prev;
        Node left  = head;
        while (right != null && left != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    // Print the Linked-List

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL \n");
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        System.out.println("Size > " + size);
        int a = ll.recursiveSearch(3);
        String str = a == -1 ? "Key Not found > " : "key found > ";
        System.out.println(str + a);
        System.out.println("Palindrome > " + ll.isPalindrome());
        ll.reverse();
        ll.print();
        ll.print();
        // ll.removeNthFromEnd(6);
        // ll.print();
    }
}
