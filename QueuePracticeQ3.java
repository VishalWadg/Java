import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
public class QueuePracticeQ3 {
    public static class Job {
        char jogId;
        int deadLine;
        int profit;
        Job (char jobId, int deadLine, int profit) {
            this.jogId = jobId;
            this.deadLine = deadLine;
            this.profit = profit;
        }
    }
    public static ArrayList<Job> jobSeq4Mxprofit(ArrayList<Job>arr) {
        Collections.sort(arr,(a,b) ->{return a.deadLine - b.deadLine;});
        int n = arr.size();
        PriorityQueue<Job> maxHeap = new PriorityQueue<>((a,b) -> {return b.profit - a.profit;});
        ArrayList<Job> res = new ArrayList<>();
        for (int i = n - 1; i > - 1; i--) {
            int slotAvailable = 0;
           if (i == 0) {
            slotAvailable = arr.get(0).deadLine;
           } else {
            slotAvailable = arr.get(i).deadLine - arr.get(i - 1).deadLine;
           }
           maxHeap.add(arr.get(i));
           while (slotAvailable > 0 && maxHeap.size() > 0) {
            res.add(maxHeap.remove());
            slotAvailable --;
           }
        }
        return res; 
    }
    public static void main (String args[]) {
        ArrayList<Job> arr = new ArrayList<>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));
        ArrayList<Job> ans = jobSeq4Mxprofit(arr);
        int maxprofit = 0;
        for (Job elmt : ans) {
            System.out.println("Job Id > " + elmt.jogId + "\tDeadline > " + elmt.deadLine + "\tProfit > " + elmt.profit);
            maxprofit += elmt.profit;
        }
        System.out.println("Total Max Profit that could be made  > " + maxprofit);
    }
}
