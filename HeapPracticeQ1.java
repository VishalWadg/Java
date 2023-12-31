import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
public class HeapPracticeQ1 {
    static PriorityQueue<Integer> min;
    static int k;
    public static List<Integer> allKthnums(int arr[]) {
        List<Integer> res = new ArrayList<>();
        for (int el : arr) {
            if (min.size() < k) {
                min.add(el);
            } else {
                if (el > min.peek()) {
                    min.poll();
                    min.add(el);
                }
            }
            if (min.size() >= k) {
                res.add(min.peek());
            } else {
                res.add(-1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        min = new PriorityQueue<>();                       // I M P
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        k = 3;
        List<Integer> res = allKthnums(arr);
        System.out.print(3 + "th largest elements for a stream at any point of time are > ");
        for (Integer el : res) {
            System.out.print(el + " ");
        }
    }
}
