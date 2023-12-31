import java.util.Stack;
public class StackPracticeQ2 {
    public static String simplify(String A) {
        Stack<String> st = new Stack<>();
        String res = "/";
        int n = A.length();
        for (int i = 0; i < n; i++) {
            String dir = "";
            while (i < n && A.charAt(i) == '/') {
                i++;
            }
            while (i < n && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }
            if (dir.equals("..")) {
                st.pop();
            } else if (dir.equals(".")) {
                continue;
            } else if (dir.length() != 0) {
                st.push(dir);
            }
        }
        Stack<String> st1 = new Stack<>();
        while (!st.isEmpty()) {
            st1.push(st.pop());
        }
        while (!st1.isEmpty()) {
            if (st1.size() != 1) {
                res += st1.pop() + "/";
            } else {
                res += st1.pop();
            }
        }
        return res;
    }
    public static void main(String args[]) {
        String str = new String("");
        String res = simplify(str);
        System.out.println("> " + res);
    }
}
