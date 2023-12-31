import java.util.Stack;

public class StackProb2 {
    public static String reverseString(String str) {
        Stack<Character> lis = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            lis.push(str.charAt(i));
            i++;
        }
        StringBuilder st = new StringBuilder("");
        while (!lis.isEmpty()) {
            char ch = lis.pop();
            st.append(ch);
        }
        return st.toString();
    }

    public static void main(String args[]) {
        String str = "hello";
        System.out.println("String befor reversal > " + str);
        String res = reverseString(str);
        System.out.println("String after reversal > " + res);
    }
}
