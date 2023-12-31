import java.util.Deque;
import java.util.Deque;
import java.util.LinkedList;
// import java.util.ArrayList;
public class QueuePracticeQ5 {
    public static void printMax(int arr[], int n, int k) {
        int i;
        Deque<Integer> deq = new LinkedList<>();
        for (i = 0; i < k; i++) {
            while (!deq.isEmpty() && arr[i] >= arr[deq.peekLast()]) {
                deq.removeLast();
            }
            deq.addLast(i); 
        }
        for (; i < n; i++) {
            System.out.print(arr[deq.peek()] + " ");
            while ((!deq.isEmpty()) && deq.peek() <= i - k) {
                deq.removeFirst();
            }
            while (!deq.isEmpty() && arr[i] >= arr[deq.peekLast()]) {
                deq.removeLast();
            }
            deq.addLast(i);
        }
        System.out.print(arr[deq.peek()]);
    }
    public static void main(String args[]) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
