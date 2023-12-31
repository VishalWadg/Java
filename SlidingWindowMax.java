import java.util.PriorityQueue;;
public class SlidingWindowMax {
    static class Pairs implements Comparable<Pairs>{
        int val;
        int idx;
        Pairs (int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pairs p2) {
            return p2.val - this.val;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        PriorityQueue<Pairs> pq = new PriorityQueue<>();
        int k = 3;
        int windoMax[] = new int[arr.length - k + 1];
        for (int i = 0; i < k; i++) {
            pq.add(new Pairs(arr[i], i));
        }
        windoMax[0] = pq.peek().val;
        for (int i = k; i < arr.length; i++) {
            pq.add(new Pairs(arr[i], i));
            while (pq.size() > 0 && pq.peek().idx <= i - k) {
                pq.remove();
            }
            windoMax[i - k + 1] = pq.peek().val;
        }
        for (int i = 0; i < windoMax.length; i++) {
            System.out.print(windoMax[i] + " ");
        }
    }
}
