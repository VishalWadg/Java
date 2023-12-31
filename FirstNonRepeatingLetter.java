import java.util.LinkedList;
import java.util.Queue;
public class FirstNonRepeatingLetter {
    public static void nonRepLet(String str) {
        int freq[] = new int [26];
        Queue<Character> Que = new LinkedList<>();
        char nonrep = '1';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Que.add(ch);
            freq[ch - 'a']++;
            while (!Que.isEmpty() && freq[Que.peek() - 'a'] > 1) {
                Que.remove();
            }
            if (Que.isEmpty()) {
                nonrep = '*';
            } else {
                nonrep = Que.peek();
            }
        }
        System.out.println(nonrep);
    }
    public static void main (String args[]) {
        String str = "abxcxba";
        nonRepLet(str);
    }
}
