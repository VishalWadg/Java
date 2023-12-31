public class LinkedList2 {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public  static Node head;
    public  static Node tail;
    public static boolean isCycle() { //Floyd's CFA
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true;  // Cycle exist's
            }
        }
        return false;  // Cycle doesn't exist's
    }
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        // detecting cycle 
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        Node prev = null;
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        System.out.println("Cycle removed ! ");
    }

    public static Node findMid(Node head) {
        Node fast = head.next;
        Node slow = head; //        used head.next to get mid as the last node of the first half of linked list
        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // Slow is the mid-Node
    }

        // Sorting A Linked List using Merge Sort Algorithm
    
    public static Node mergeSort(Node head) { // Divide 
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = findMid(head);
        Node rH = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rH);
        return merge(newLeft, newRight);
    }

    public static Node merge(Node lH, Node rH) {
        Node mergList = new Node(-1);
        Node temp = mergList;
        while (lH != null && rH != null) {
            if (lH.data <= rH.data) {
                temp.next = lH;
                temp = temp.next;
                lH = lH.next;
            } else {
                temp.next = rH;
                temp = temp.next;
                rH = rH.next;
            }
        }
        // left half
        while (lH != null) {
            temp.next = lH;
            temp = temp.next;
            lH = lH.next;
        }
        // right half
        while (rH != null) {
            temp.next = rH;
            temp = temp.next;
            rH = rH.next;
        }
        return mergList.next;
    }
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL \n");
    }

    public static void main(String args[]) {
        // LinkedList2 ll = new LinkedList2();  
        head = new Node(2);
        Node temp = new Node(1);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println (isCycle());
        print(mergeSort(head));
    }
}
