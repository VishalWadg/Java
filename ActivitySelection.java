import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class ActivitySelection {
    public static void main(String args[]) {
        int start [] = {3, 8, 0, 5, 1, 5};
        int end [] = {4, 9, 6, 9, 2, 7};                       // Here end the activities are already sorted acording to the endtime
        int act [][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }
        Arrays.sort(act, Comparator.comparingDouble(o -> (o[2]))); // comparator               lambda function
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(act[0][0]);
        int lastEnd = act[0][2];
        for (int i = 1; i < end.length; i++) {
            if (act[i][1] >= lastEnd) {
               arr.add(act[i][0]);
               lastEnd = act[i][2];
            }
        }
        for (Integer el : arr) {
            System.out.print("A" + el + " ");
        }
    }
}
