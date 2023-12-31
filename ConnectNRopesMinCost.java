import java.util.PriorityQueue;

public class ConnectNRopesMinCost {
    public static int minCost(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int a = 0, b = 0, c = 0;
        while (pq.size() > 1) {
           a = pq.remove();
           b = pq.remove();
           c += (a+b);
           pq.add(a + b);
        }
        return c;
    }
    public static void main(String[] args) {
        int length[] = {4, 3, 2, 6};
        System.out.println(" > " + minCost(length));
    }
}
