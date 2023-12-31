import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueUsingJCF {
    public static void main (String args[]) {
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new ArrayDeque<>();
        // LinkedList
        for (int i = 1; i <= 5; i++) {
            Q1.add(i);                  // 1 2 3 4 5
        }
        System.out.println("Queue Using JCF- LinkedList");
        while (!Q1.isEmpty()) {
            System.out.print(Q1.remove() + " ");
        }
        System.out.println();
        // ArrayDeque
        for (int i = 5; i >= 1; i--) {
            Q2.add(i);                    //5 4 3 2 1
        }
        System.out.println("Queue Using JCF- ArrayDeque");
        while (!Q2.isEmpty()) {
            System.out.print(Q2.remove() + " ");
        }
    }
}
