import java.util.ArrayList;
public class StacksArrayLlist {
    static class Stack{
        static ArrayList<Integer>list = new ArrayList<>();
        public boolean isEmpty() {
            return list.size() == 0;
        }
        public static void push (int a) {
            list.add(a);
        }
        public static int pop () {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }
    public static void main (String args[]) {
        Stack list = new Stack();
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println(list.isEmpty());
        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
        System.out.print(list.isEmpty());
    }
}
