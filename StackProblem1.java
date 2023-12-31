import java.util.Stack;
public class StackProblem1 {
    public static void pushtoBottom(Stack<Integer>st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushtoBottom(st, data);
        st.push(top);
    }
    public static void main(String args[]) {
        Stack<Integer>st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        pushtoBottom(st, 5);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
