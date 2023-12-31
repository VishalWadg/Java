import java.util.LinkedList;
import java.util.Queue;
public class HeapPracticeQ2 {
    public static int time2FilNSlots(int arr[], int N) {
        int time = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean vis [] = new boolean[N + 1];
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
            vis[arr[i]] = true;
        }
        
        while (q.size() > 0) {
            int qsize = q.size();
            for (int i = 0; i < qsize; i++) {
                int curr = q.poll();  
                if (curr - 1 >= 1 && (!vis[curr - 1])) {
                    vis[curr - 1] = true;
                    q.add(curr - 1);
                }
                if (curr + 1 <= N && (!vis[curr + 1])) {
                    vis[curr + 1] = true;
                    q.add(curr + 1);
                }
            }
            time ++;
        }
        return time - 1;
    }
    public static void main(String[] args) {
        int N = 9;
        int arr[] = {5, 8};
        int time = time2FilNSlots(arr, N);
        System.out.println("Time to fill "+ N + " slots > " + time);   // 
    }
}
