import java.util.Stack;
public class ReverseaStack {
    public static void pushtoBottom(Stack<Integer>st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushtoBottom(st, data);
        st.push(top);
    }
    public static void revStack(Stack<Integer>s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        revStack(s);
        pushtoBottom(s, top);
    }
    public static void main (String args[]) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);    // <----- top 
        revStack(s);
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
