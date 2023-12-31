import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePracticeQ4 {
    public static void reverseKElems(Queue<Integer> arr, int k) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        Queue<Integer> sup = new LinkedList<>();
        while (!arr.isEmpty()) {
            if (i++ < k) {
                st.push(arr.remove());
                continue;
            }
            sup.add(arr.remove());
        }
        while (!st.isEmpty()) {
            arr.add(st.pop());
        }
        while (!sup.isEmpty()) {
            arr.add(sup.remove());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> arr = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i * 10);
        }
        reverseKElems(arr, 6);
        while (!arr.isEmpty()) {
            System.out.print(arr.remove() + " ");
        }
    }
}
