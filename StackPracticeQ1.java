import java.util.LinkedList;
import java.util.Stack;
public class StackPracticeQ1 {
    public static boolean isPalindromeList(LinkedList<Character> list) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            s.push(ch);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != s.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('B');
        list.add('A');
        list.add('C');
        list.add('E');
        list.add('C');
        list.add('A');
        list.add('R');
        System.out.print(" > " + isPalindromeList(list));
    }
}
