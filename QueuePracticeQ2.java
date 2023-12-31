import java.util.PriorityQueue;

import javax.sql.rowset.serial.SerialStruct;
public class QueuePracticeQ2 {
    public static int minCost(int arr[]) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            que.add(arr[i]);
        }
        int res = 0;
        while (que.size() > 1) {
            int first = que.poll();
            int secnd = que.poll();
            res += first + secnd;
            que.add(first + secnd);
        }
        return res;
    }
    public static void main(String args[]) {
        int arr[] = {4, 3, 2, 6};
        System.out.println(">" + minCost(arr));
    }
}
