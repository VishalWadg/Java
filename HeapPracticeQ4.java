import java.util.Comparator;
import java.util.PriorityQueue;
public class HeapPracticeQ4 {
    public static int operationstoHalveSum(int arr[]) {
        int oper = 0;
        int inisum = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int el : arr) {
            inisum += el;
            q.add(el);
        }
        int sumhalf = inisum / 2;
        while (!(inisum <= sumhalf)) {
            int curr = q.poll();
            System.out.println(curr);
            inisum -= curr;
            inisum += (curr / 2);
            q.add(curr / 2);
            oper++;
        }
        return oper;
    }
    public static void main(String[] args) {
       int arr [] = {4, 6, 3, 9, 10, 2};
       System.out.print("Minimum no. of operations to halve the given array is > " + operationstoHalveSum(arr));
    }
}
