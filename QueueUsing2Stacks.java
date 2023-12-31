import java.util.Stack;;
public class QueueUsing2Stacks {
    static class Queue {
        static Stack<Integer> st1 = new Stack<>();
        static Stack<Integer> st2 = new Stack<>();
        public static boolean isEmpty() {
            return st1.isEmpty();
        }
        public static void add (int data) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            st1.push(data);
            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }
        }
        public static int remove () {
            if (st1.isEmpty()) {
                System.out.println("Empty Queue !");
                return -1;
            }
            return st1.pop();
        }

        public static int peek () {
            if (st1.isEmpty()) {
                System.out.println("Empty Queue !");
                return -1;
            }
            return st1.peek();
        }
    }
    public static void main (String args[]) {
        Queue qu = new Queue();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        while (!qu.isEmpty()) {
            System.out.println(qu.remove());
        }
    }
}
