import java.util.LinkedList;
import java.util.Queue;
public class QueuePracticeQ1 {
    public static void printBinary(int n) {
        Queue<String> que = new LinkedList<>();
        que.add("1");
        String str1 = "", str2 = "";
        while (n-- > 0) {
            str1 = que.remove();
            str2 = str1;
            System.out.println(str1);
            str1 = str1 + "0";
            str2 = str2 + "1";
            que.add(str1);
            que.add(str2);
        }
    }
    public static void main (String args[]) {
        int n = 5;
        printBinary(n);
    }
}
