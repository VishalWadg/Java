import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueReversal {
    public static void reverse(Queue<Integer>que) {
        Stack<Integer>st = new Stack<>();
        while (!que.isEmpty()) {
            st.push(que.remove());
        }

        while (!st.isEmpty()) {
            que.add(st.pop());
        }
    }
    public static void main (String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        
        reverse(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
