import java.util.LinkedList;
import java.util.PriorityQueue;
public class HeapPracticeQ5 {
    public static class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> {return a.val - b.val;});
        int k = lists.length;
        for (int i = 0; i < k; i++) {
            if(lists[i] != null) {
                pq.add(lists[i]);
            }
        }
        if(pq.isEmpty()) {
            return null;
        }
        ListNode nwHead = pq.poll();
        ListNode tmpNode = nwHead;
        if(nwHead.next != null) {
            pq.add(tmpNode.next);
        }
        while(!pq.isEmpty()) {
            ListNode curr = pq.poll();
            tmpNode.next = curr;
            tmpNode = tmpNode.next;
            if(curr.next != null) {
                pq.add(curr.next);
            }
        }
        return nwHead;
    }
    public static void main(String[] args) {
        ListNode Nodes[] = new ListNode[3];
        ListNode head1 = new ListNode(1);
        Nodes[0] = head1;
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);
        head1.next.next.next = new ListNode(7);

        ListNode head2 = new ListNode(2);
        Nodes[1] = head2;
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(8);

        ListNode head3 = new ListNode(0);
        Nodes[2] = head3;
        head3.next = new ListNode(9);
        head3.next.next = new ListNode(10);
        head3.next.next.next = new ListNode(11);
        ListNode res = mergeKLists(Nodes);
        if (res != null) {
            printList(res);
        }
    }
}
