import java.util.Stack;
public class NextGreaterElement {
    public static void nextGreater(int elems [], int nexgr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = elems.length - 1; i >= 0; i--) {
            int curr = elems[i];
            while (!s.isEmpty() && curr >= elems[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                s.push(i);
                nexgr[i] = -1;
            } else {
                nexgr[i] = elems[s.peek()];
                s.push(i);
            }
        }
    }
    public static void main(String args[]) {
        int elems [] = {6, 8, 0, 1, 3};
        int nexgr [] = new int[elems.length];
        nextGreater(elems, nexgr);
        for (int i = 0; i < nexgr.length; i++) {
            System.out.print(" " + nexgr[i] + " ");
        }
    }
}
